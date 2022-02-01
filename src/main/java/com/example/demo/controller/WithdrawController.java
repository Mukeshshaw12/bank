package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Withdraw;
import com.example.demo.service.WithdrawService;


@RestController
public class WithdrawController {
	
	
	
	@Autowired
	WithdrawService withdrawService;
	@GetMapping("/withdraw")
	Iterable<Withdraw> getWithdraws() {
	      return withdrawService.getWithdraw();
	 }
  
	@PostMapping("/withdraw") // create
	void createWithdraw (@RequestBody @Valid Withdraw withdraw ,@PathVariable("id") Integer id) {
		System.out.println(withdraw.getAccountnumber());
		System.out.println(withdraw.getAmount());
	withdrawService.saveWithdraw(withdraw);
	}
	

}
