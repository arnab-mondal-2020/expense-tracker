package com.expense.tracker.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Session {
	private String sessionId;
	private String username;
	private String loginTime;

	public String getSessionId() {
		return sessionId;
	}

	public String getUsername() {
		return username;
	}

	public String getLoginTime() {
		return loginTime;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

}
