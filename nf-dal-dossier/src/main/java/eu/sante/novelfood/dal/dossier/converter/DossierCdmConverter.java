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
public class DossierCdmConverter implements Converter<Dossier, eu.sante.novelfood.dal.dossier.model.Dossier> {

	@Override
	public eu.sante.novelfood.dal.dossier.model.Dossier convert(Dossier dossierCdm) {
		Assert.notNull(dossierCdm, "dossierCdm cannot be null");

		eu.sante.novelfood.dal.dossier.model.Dossier dossier = new eu.sante.novelfood.dal.dossier.model.Dossier();
		dossier.setId(dossierCdm.getId());
		dossier.setText(dossierCdm.getText());
		return dossier;
	}

}
