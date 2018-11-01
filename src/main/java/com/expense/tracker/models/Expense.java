package com.expense.tracker.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document
public class Expense implements Serializable {
	private static final long serialVersionUID = -6206270749033053237L;

	@Id
	@JsonProperty("expenseId")
	private String expenseId;

	@JsonProperty("amount")
	private Double amount;

	@JsonProperty("date")
	private String date;

	@JsonProperty("expenseDescription")
	private String expenseDescription;

	@JsonProperty("expenseType")
	private String expenseType;

	@JsonProperty("incurredBy")
	private String incurredBy;

	public String getExpenseId() {
		return expenseId;
	}

	public Double getAmount() {
		return amount;
	}

	public String getDate() {
		return date;
	}

	public String getExpenseDescription() {
		return expenseDescription;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getIncurredBy() {
		return incurredBy;
	}

	public void setIncurredBy(String incurredBy) {
		this.incurredBy = incurredBy;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", amount=" + amount + ", date=" + date + ", expenseDescription="
				+ expenseDescription + ", expenseType=" + expenseType + "]";
	}

}
