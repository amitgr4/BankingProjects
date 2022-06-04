package com.banking.fin.service;

import java.util.List;
import java.util.Optional;

import com.banking.fin.entity.Banking;

public interface BankingService {
	
	public List< Banking> getAllCustomer();
	
	public Banking saveAllcustomer(Banking banking);
    
    public void Deletecustomer(long id);

    public Optional<Banking> cusById(Long cusId);

	public Banking getByName(String cusName);

	public List<Banking> getAllCustm();

	public Banking UpdateById(Long cusId, Banking banking);

	public Banking UpdatedByName(String cusName, Banking banking);

	public boolean deleteById(Long cusId);

	

	
	
  



    
    

	

}
