package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BalanceEnquiryRepository;
import com.example.demo.entity.BalanceEnquiry;


@Service
public class BalanceEnquiryService {

	@Autowired
	BalanceEnquiryRepository balanceEnquiryRepository;
	
	
	public void saveBalanceEnquiry(@Valid BalanceEnquiry balanceEnquiry) {
		
		balanceEnquiryRepository.save(balanceEnquiry);
	}

}
