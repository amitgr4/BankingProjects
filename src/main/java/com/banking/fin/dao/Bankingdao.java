package com.banking.fin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.banking.fin.entity.Banking;


 public interface Bankingdao extends JpaRepository<Banking, Long>{

 public	Banking findByCusName(String cusName);
// public Banking findByCusNameIgnoreCase(String cusName);
// public boolean deleteByCusId(long cusId);
 


	

}