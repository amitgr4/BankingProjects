package com.banking.fin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BankingProjectApplicationTests {
	

	private Calculator c=new Calculator();

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void testSum() {
		
		
		//expectedResult
		int expectedResult=18;
		
		//actualResult
		int actualResult=c.doSum(12,3 , 2);
		assertThat(actualResult).isNotEqualTo(expectedResult);
	}
	
	@Test
	void testProduct() {
		//expextedResult
		int expectedResult=6;
		
		//actualResult
		int actualResult=c.doProduct(3,2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testcompareTwoName() {
		
		//actualResult
		boolean actualResult=c.compareTwoName("Raj","Amit");
		assertThat(actualResult).isTrue();
		
		
	}

}
