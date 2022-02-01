package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Deposit;
import com.example.demo.entity.Start;
import com.example.demo.DepositRepository;
import com.example.demo.StartRepository;

@Service
public class DepositService {
     @Autowired
     DepositRepository depositRepository;
     @Autowired
     StartRepository startRepository;
	public void saveDeposit(@Valid Deposit deposit, Integer id) {
		
		Start start= startRepository.findById(id).get();
		Double initial_amount=start.getDeposit().getAmount();
		Double total_amount=initial_amount+deposit.getAmount();
		
		Deposit depositfinal = start.getDeposit();
		depositfinal.setAmount(total_amount);
		
		depositRepository.save(depositfinal);
		start.setDeposit(depositfinal);
		startRepository.save(start);
		
	}
	public Iterable<Deposit> getDeposit() {
		return depositRepository.findAll();
	}

}
