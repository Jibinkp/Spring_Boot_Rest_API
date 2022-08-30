package com.example.My.Accounts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="my_account")
public class Accounts {
	
	@Id
	@GeneratedValue
	private long id;
	private String clientName;
	private double amount;
	private String status;
	private String paymentStatus;
	private String comment;
	
	public Accounts() {
		
	}
	
	
	public Accounts(long id, String clientName, double amount, String status, String paymentStatus, String comment) {
		this.id = id;
		this.clientName = clientName;
		this.amount = amount;
		this.status = status;
		this.paymentStatus = paymentStatus;
		this.comment = comment;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
