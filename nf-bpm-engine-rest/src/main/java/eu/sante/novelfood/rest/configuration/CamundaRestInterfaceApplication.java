/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.novelfood.rest.configuration;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.camunda.bpm.engine.rest.impl.CamundaRestResources;

@ApplicationPath("resources")
public class CamundaRestInterfaceApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		// custom classes

		// add all camunda engine rest resources (or just add those that you actually need).
		classes.addAll(CamundaRestResources.getResourceClasses());

		// mandatory
		classes.addAll(CamundaRestResources.getConfigurationClasses());

		return classes;
	}

}
