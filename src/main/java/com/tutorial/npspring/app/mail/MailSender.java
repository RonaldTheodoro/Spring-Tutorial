package com.tutorial.npspring.app.mail;

public interface MailSender {

	void send(String to, String subject, String body);
}
