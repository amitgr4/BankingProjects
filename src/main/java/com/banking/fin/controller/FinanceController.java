package com.banking.fin.controller;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.banking.fin.entity.Banking;
import com.banking.fin.service.BankingService;

@RestController
@RequestMapping("/Banks")
public class FinanceController {
	@Autowired
	private BankingService Bankingservice;
	
	
	
	@GetMapping("/getAllcus")
	public ResponseEntity<List<Banking>> getAllCustomer(){
		List<Banking> list= Bankingservice. getAllCustomer();
		if(list.isEmpty()) {
		return new ResponseEntity<List<Banking>>(list, HttpStatus.NO_CONTENT)	;
		
		}else {
			return new ResponseEntity<List<Banking>>(list, HttpStatus.OK)	;
			
		}
	}
	
	
	@PostMapping("/savecus")
	public Banking saveAllcustomer(@RequestBody Banking banking) {
		
		return Bankingservice.saveAllcustomer(banking);
		
	}
	@DeleteMapping("/deletecus/{Id}")
	public String Deletecustomer(@PathVariable("Id") long id ) {
		Bankingservice.Deletecustomer(id);
		return "Deleted Successfully Customer!!";
	}
	
	@GetMapping("/customer/{Id}")
	public Optional<Banking> cusById(@PathVariable("Id") Long cusId) {
		
		return Bankingservice.cusById(cusId);
	
	
	}
		@GetMapping("customer/name/{name}")
	public Banking getByName(@PathVariable("name")String cusName){
		
		return Bankingservice.getByName(cusName);
		
	}
	
		@GetMapping("/cust")		 
	public List<Banking>getAllCustm() {
			
		return Bankingservice.getAllCustm();

		}
		@PutMapping("customer/{id}")		 
	 public Banking UpdateById(@PathVariable("id")Long cusId,@RequestBody Banking banking) {
			
			return Bankingservice.UpdateById(cusId,banking);
		}
	
     @PutMapping("customer/{name}")
	public Banking UpdatedByName(@PathVariable("name")String cusName,@RequestBody Banking banking) {
    	 return Bankingservice.UpdatedByName(cusName,banking);
     }
	
     @DeleteMapping("/dele/{id}")
     public ResponseEntity<Boolean> deleteById(@PathVariable("id")Long cusId){
    	 boolean b=Bankingservice.deleteById(cusId);
    	 if(b) {
    	 return new ResponseEntity<Boolean>(b,HttpStatus.OK);
    	 }else {
    		 return new ResponseEntity<Boolean>(b,HttpStatus.CONFLICT);
    		
    	 }
     }
     
	}




