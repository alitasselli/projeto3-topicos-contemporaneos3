package com.example.Payroll;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import payroll.Business;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.PropertyAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class BusinessTests {

	@Test
	void mandatoryBusiness() {
		private String codee;
	     
	    public void setCodee(String codee) {
	        if (codee == null) {
	            throw new IllegalArgumentException("Code cannot be blank");
	        } else {
	            if (codee.length() < 12) {
	                throw new IllegalArgumentException("Code is too short");
	            } else if (codee.length() > 12) {
	                throw new IllegalArgumentException("Code is too long");
	            }
	        }
	         
	        this.codee = codee;	
	    }
	}
	
	
	@Test
	void mandatoryDescription() {
		private Long description;
	     
	    public void setDescription(Long description) {
	        if (description == null) {
	            throw new IllegalArgumentException("Description cannot be blank");
	        } else {
	            if (description.length() < 1) {
	                throw new IllegalArgumentException("Description is too short");
	            } else if (description.length() > 50) {
	                throw new IllegalArgumentException("Description is too long");
	            }
	        }
	         
	        this.description = description;	
	    }
	}
	
	@Test
	void mandatoryTax() {
		private Integer tax;
	     
	    public void setTax(Integer tax) {
	        if (tax == null) {
	            throw new IllegalArgumentException("Tax cannot be blank");
	        } else {
	            if (tax.length() < 0) {
	                throw new IllegalArgumentException("Tax cannot be negative");
	        }
	         
	        this.tax = tax;	
	    }

	
	}
}
	