/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.novelfood.dal.dossier.service;

import ch.lambdaj.Lambda;
import eu.sante.novelfood.dal.dossier.converter.DossierCdmConverter;
import eu.sante.novelfood.dal.dossier.converter.DossierConverter;
import eu.sante.novelfood.dal.dossier.repository.service.DossierRepository;
import eu.sante.rasff.novelfood.cdm.Dossier;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service("dossierService")
@Transactional(propagation = Propagation.REQUIRED)
public class DossierServiceImpl implements DossierService {

	private final DossierRepository dossierRepository;

	public DossierServiceImpl(DossierRepository dossierRepository) {
		Assert.notNull(dossierRepository, "dossierRepository cannot be null");
		this.dossierRepository = dossierRepository;
	}

	/**
	 *
	 * @param dossier
	 * @return
	 */
	@Override
	@Transactional(readOnly = false)
	public Dossier save(Dossier dossier) {
		Assert.notNull(dossier, "dossier cannot be null");
		return new DossierConverter().convert(
				dossierRepository.save(new DossierCdmConverter().convert(dossier)
				));
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public Dossier getOne(Long id) {
		Assert.notNull(id, "id cannot be null");
		Assert.isTrue(id > 0, "id must be positive");
		return new DossierConverter().convert(
				dossierRepository.getOne(id)
		);
	}

	/**
	 *
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Dossier> findAll() {
		return Lambda.convert(dossierRepository.findAll(), new DossierConverter());
	}
}
