/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.novelfood.dal.dossier.converter;

import ch.lambdaj.function.convert.Converter;
import eu.sante.rasff.novelfood.cdm.Dossier;
import org.springframework.util.Assert;

/**
 *
 * @author voganlu
 */
public class DossierConverter implements Converter<eu.sante.novelfood.dal.dossier.model.Dossier, Dossier> {

	@Override
	public Dossier convert(eu.sante.novelfood.dal.dossier.model.Dossier dossier) {
		Assert.notNull(dossier, "dossier cannot be null");
		Dossier dossierCdm = new Dossier();
		dossierCdm.setId(dossier.getId());
		dossierCdm.setText(dossier.getText());
		return dossierCdm;
	}

}
