package com.banking.fin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cusId;
	private String cusName;
	private String cusAddress;
	private long cusAccount;
	
	public Banking() {
		super();
		
	}
	public Banking(long cusId, String cusName, String cusAddress, long cusAccount) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAddress = cusAddress;
		this.cusAccount = cusAccount;
	}
	public long getCusId() {
		return cusId;
	}
	public void setCusId(long cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public long getCusAccount() {
		return cusAccount;
	}
	public void setCusAccount(long cusAccount) {
		this.cusAccount = cusAccount;
	}
	@Override
	public String toString() {
		return "Banking [cusId=" + cusId + ", cusName=" + cusName + ", cusAddress=" + cusAddress + ", cusAccount="
				+ cusAccount + "]";
	}
	
	
	
	

}
