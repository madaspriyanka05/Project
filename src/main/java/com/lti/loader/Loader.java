package com.lti.loader;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class Loader implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("in...");
		ServletRegistration.Dynamic servlet = servletContext.addServlet("mvc", new DispatcherServlet());
		servlet.setLoadOnStartup(1);
		servlet.setInitParameter("contextConfigLocation", "/WEB-INF/app-config.xml");
		servlet.addMapping("*.lti");
	}
}
