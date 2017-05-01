package com.tutorial.npspring.app.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoBean {
	
	private static final Log log = LogFactory.getLog(MockMailSender.class);
	
	public DemoBean() {
		log.info("DemoBean created");
	}
	
	public String foo() {
		return "something";
	}
}
