package com.ruihe.activiti;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Test {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:/activiti.cfg.xml");
		//System.out.println(ac.getBean("processEngine"));
		/*ProcessEngine processEngine = (ProcessEngine)ac.getBean("processEngine");
		RepositoryService repositoryService = processEngine.getRepositoryService();
		repositoryService.createDeployment().addClasspathResource("com/ruihe/process/VacationRequest.bpmn20.xml").deploy();

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("employeeName", "Kermit");
		variables.put("numberOfDays", new Integer(4));
		variables.put("vacationMotivation", "I'm really tired!");

		RuntimeService runtimeService = processEngine.getRuntimeService();
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("vacationRequest", variables);
*/
		ProcessEngines.init();
		while(true){
			
		}
	}

}
