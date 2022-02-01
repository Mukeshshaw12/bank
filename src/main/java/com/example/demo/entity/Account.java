package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
	
	
    private String accounttype;
	
	
    private Double depositinitial;
    
	
    @OneToOne(mappedBy ="account")
	Start start;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public Double getDepositinitial() {
		return depositinitial;
	}
	public void setDepositinitial(Double depositinitial) {
		this.depositinitial = depositinitial;
	}
    
    
}
