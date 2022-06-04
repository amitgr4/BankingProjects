package com.banking.fin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.banking.fin.dao.Bankingdao;
import com.banking.fin.entity.Banking;

@Service
public class BankingImpl_service implements BankingService {
	
	@Autowired
	private Bankingdao bankingdao;

	@Override
	public List<Banking> getAllCustomer() {
		List<Banking> list=bankingdao.findAll();
		
		return list;
	}

	@Override
	public Banking saveAllcustomer(Banking banking) {
	
	return bankingdao.save(banking);
  }

	@Override
	public void Deletecustomer(long id) {
		
	 bankingdao.deleteById(id);
	}

	@Override
	public Optional<Banking> cusById(Long cusId) {
		
		return bankingdao.findById(cusId);
	}

	@Override
	public Banking getByName(String cusName) {
		
		
		return bankingdao.findByCusName(cusName);
	}

	@Override
	public List<Banking> getAllCustm() {
		
		List<Banking> bnk=bankingdao.findAll();
		return  bnk;
	}

	@Override
	public Banking UpdateById(Long cusId, Banking banking) {
		
		return bankingdao.save(banking);
	}

	@Override
	public Banking UpdatedByName(String cusName, Banking banking) {
		
		return bankingdao.save(banking);
	}

	@Override
	public boolean deleteById(Long cusId) {
		
	bankingdao.deleteById(cusId);
	return true;
      
	
	
	}


	
 }


	




