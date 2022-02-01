package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BalanceEnquiry;
import com.example.demo.service.BalanceEnquiryService;

@RestController
public class BalanceEnquiryController {

	
	@Autowired
	BalanceEnquiryService balanceEnquiryService;
	
	@PostMapping("/balanceEnquiry") // create
	void createBalanceEnquiry (@RequestBody @Valid BalanceEnquiry balanceEnquiry) {
		System.out.println(balanceEnquiry.getAccountnumber());
	balanceEnquiryService.saveBalanceEnquiry(balanceEnquiry);
	}
	
	
	
	
	
	
	
}
