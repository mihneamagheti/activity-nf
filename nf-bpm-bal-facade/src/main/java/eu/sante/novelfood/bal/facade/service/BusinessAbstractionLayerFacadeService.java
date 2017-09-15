package eu.sante.novelfood.bal.facade.service;

import eu.sante.novelfood.dal.dossier.service.DossierService;

/**
 *
 * @author voganlu
 */
public interface BusinessAbstractionLayerFacadeService extends DossierService {

	/**
	 * additional demo services
	 *
	 * @param request
	 * @return
	 */
	String toUppercase(String request);

	String toLowercase(String request);
}
