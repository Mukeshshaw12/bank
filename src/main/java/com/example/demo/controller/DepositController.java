package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Deposit;
import com.example.demo.service.DepositService;

@RestController
public class DepositController {

	@Autowired
	DepositService depositService;
	@GetMapping("/deposit")
	Iterable<Deposit> getDeposits() {
	      return depositService.getDeposit();
	 }
  
	@PostMapping("/deposit") // create
	void createDeposit (@RequestBody @Valid Deposit deposit, @PathVariable("id") Integer id) {
		System.out.println(deposit.getAccountnumber());
		System.out.println(deposit.getAmount());
	depositService.saveDeposit(deposit, id);
	}
	
	
	
	
	
	
}
