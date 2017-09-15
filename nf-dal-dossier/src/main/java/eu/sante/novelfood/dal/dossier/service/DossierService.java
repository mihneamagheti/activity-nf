/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.novelfood.dal.dossier.service;

import eu.sante.rasff.novelfood.cdm.Dossier;
import java.util.List;

/**
 *
 * @author voganlu
 */
public interface DossierService {

	Dossier save(Dossier dossier);

	Dossier getOne(Long id);

	List<Dossier> findAll();

}
