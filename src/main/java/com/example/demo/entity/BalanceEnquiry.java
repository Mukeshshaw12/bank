package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BalanceEnquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String accountnumber;
	
	
	@OneToOne(mappedBy ="balanceEnquiry")
	Start start;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
}
