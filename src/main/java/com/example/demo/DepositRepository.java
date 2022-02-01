package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Deposit;

public interface DepositRepository extends CrudRepository<Deposit , Integer>{

}
