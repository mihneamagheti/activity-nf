/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.novelfood.dal.dossier.repository.service;

import eu.sante.novelfood.dal.dossier.model.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author voganlu
 */
public interface DossierRepository extends JpaRepository<Dossier, Long> {

}
