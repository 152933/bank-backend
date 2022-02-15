package com.bankManage.management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin(origins = "http://192.168.99.101:4200")
@SpringBootApplication
@RestController
@RequestMapping(value = "/api/customer")
public class BankManagement {

	private List<Customer> customer = new ArrayList<Customer>();
	
	@RequestMapping(method = RequestMethod.POST)
	public List<Customer> saveEmployee(@RequestBody Customer cus) {
		
		this.customer.add(cus);
		return this.customer;
		}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Customer> getEmployee() {
		return this.customer;
	}

}
