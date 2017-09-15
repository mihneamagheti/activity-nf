/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.novelfood.bal.facade.service;

import eu.sante.novelfood.dal.dossier.service.DossierService;
import eu.sante.rasff.novelfood.cdm.Dossier;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

public class BusinessAbstractionLayerFacadeServiceImpl implements BusinessAbstractionLayerFacadeService {

	final Logger logger = LoggerFactory.getLogger(BusinessAbstractionLayerFacadeServiceImpl.class);

	private final DossierService dossierService;

	public BusinessAbstractionLayerFacadeServiceImpl(DossierService dossierService) {
		Assert.notNull(dossierService, "dossierService cannot be null");
		this.dossierService = dossierService;
	}

	/**
	 *
	 * @param dossier
	 * @return
	 */
	@Override
	public eu.sante.rasff.novelfood.cdm.Dossier save(eu.sante.rasff.novelfood.cdm.Dossier dossier) {
		Assert.notNull(dossier, "dossier cannot be null");

		Dossier savedDossier = dossierService.save(dossier);
		logger.info("saving {} from input {}", savedDossier, dossier);
		return savedDossier;
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Dossier getOne(Long id) {
		Assert.notNull(id, "id cannot be null");
		Assert.isTrue(id > 0, "id must be positive");
		Dossier readDossier = dossierService.getOne(id);
		logger.info("read {} from input {}", readDossier, id);
		return readDossier;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public List<Dossier> findAll() {
		logger.info("listing all the dossiers");
		return dossierService.findAll();
	}

	@Override
	public String toUppercase(String request) {
		Assert.notNull(request, "request cannot be null");
		return request.toUpperCase();
	}

	@Override
	public String toLowercase(String request) {
		Assert.notNull(request, "request cannot be null");
		return request.toLowerCase();
	}

}
