package com.ruihe.activiti;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.activiti.engine.ProcessEngines;

public class ProcessEnginesServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ProcessEngines.init();
	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ProcessEngines.destroy();
	}

}
