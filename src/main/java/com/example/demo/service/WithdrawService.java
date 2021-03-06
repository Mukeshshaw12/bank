package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StartRepository;
import com.example.demo.WithdrawRepository;
import com.example.demo.entity.Withdraw;


@Service
public class WithdrawService {
	@Autowired
	WithdrawRepository withdrawRepository;
	
	@Autowired
	StartRepository startRepository;
	public Iterable<Withdraw> getWithdraw() {
		return withdrawRepository.findAll();
	}
	public void saveWithdraw(@Valid Withdraw withdraw ) {
		withdrawRepository.save(withdraw);

	}

}
