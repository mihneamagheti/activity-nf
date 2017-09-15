/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.novelfood.rest.provider;

import java.util.Set;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.rest.spi.ProcessEngineProvider;

/**
 *
 * @author voganlu
 */
public class RestEngineProvider implements ProcessEngineProvider {

	@Override
	public ProcessEngine getDefaultProcessEngine() {
		return ProcessEngines.getDefaultProcessEngine();
	}

	@Override
	public ProcessEngine getProcessEngine(String name) {
		return ProcessEngines.getProcessEngine(name);
	}

	@Override
	public Set<String> getProcessEngineNames() {
		return ProcessEngines.getProcessEngines().keySet();
	}

}
