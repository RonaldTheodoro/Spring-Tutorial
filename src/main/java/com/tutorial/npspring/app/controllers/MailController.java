package com.tutorial.npspring.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.npspring.app.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;

	@Autowired
	public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("abc@example", "Some subject", "the content");
		return "Mail sent";
	}
}
