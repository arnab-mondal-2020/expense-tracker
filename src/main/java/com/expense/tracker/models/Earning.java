package com.expense.tracker.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document
public class Earning implements Serializable {
	private static final long serialVersionUID = 123482984239L;

	@Id
	@JsonProperty("earningId")
	private String earningId;
	@JsonProperty("amount")
	private Double amount;
	@JsonProperty("dateOfCredit")
	private String dateOfCredit;
	@JsonProperty("earningType")
	private String earningType;

	public String getEarningId() {
		return earningId;
	}

	public Double getAmount() {
		return amount;
	}

	public String getDateOfCredit() {
		return dateOfCredit;
	}

	public String getEarningType() {
		return earningType;
	}

	public void setEarningId(String earningId) {
		this.earningId = earningId;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setDateOfCredit(String dateOfCredit) {
		this.dateOfCredit = dateOfCredit;
	}

	public void setEarningType(String earningType) {
		this.earningType = earningType;
	}

	@Override
	public String toString() {
		return "Earning [earningId=" + earningId + ", amount=" + amount + ", dateOfCredit=" + dateOfCredit
				+ ", earningType=" + earningType + "]";
	}

}
