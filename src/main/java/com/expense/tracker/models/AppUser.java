package com.expense.tracker.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document
public class AppUser implements Serializable {
	private static final long serialVersionUID = -915811096148783505L;

	@Id
	@JsonProperty("userId")
	private String userId;

	@JsonProperty("username")
	private String username;

	@JsonProperty("password")
	private String password;

	@JsonProperty("memberId")
	private String memberId;

	@JsonProperty("createdOn")
	private String createdOn;

	@JsonProperty("nickName")
	private String nickName;

	@JsonProperty("fullName")
	private String fullName;

	@JsonProperty("contactNumber")
	private String contactNumber;

	@JsonProperty("confirmPassword")
	private String confirmPassword;

	public String getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getNickName() {
		return nickName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
