package com.expense.tracker.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document
public class Member implements Serializable {

	private static final long serialVersionUID = -1201595533407201648L;

	@Id
	@JsonProperty("memberId")
	private String memberId;

	@JsonProperty("nickName")
	private String nickName;

	@JsonProperty("fullName")
	private String fullName;

	@JsonProperty("contactNumber")
	private String contactNumber;

	@JsonProperty("appUserId")
	private String appUserId;

	public String getMemberId() {
		return memberId;
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

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public String getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(String appUserId) {
		this.appUserId = appUserId;
	}

}
