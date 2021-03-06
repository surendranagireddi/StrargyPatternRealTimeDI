package com.java.controller;

import com.java.dto.CustomerDTO;
import com.java.service.ICustomerMgmtService;
import com.java.vo.CustomerVO;

public final class MainController {
	
	// HAS -A property
		private  ICustomerMgmtService  service;
		
		public MainController(ICustomerMgmtService service) {
			System.out.println("MainController: 1-param constructor");
			 this.service=service;
		}
		
		public String   processCustomer(CustomerVO vo)throws Exception {
			 //convert VO class obj to DTO class obj
			 CustomerDTO custDTO=new CustomerDTO();
			 custDTO.setCname(vo.getCname());
			 custDTO.setCadd(vo.getCadd());
			 custDTO.setPamt(Double.parseDouble(vo.getPamt()));
			 custDTO.setTime(Double.parseDouble(vo.getTime()));
			 custDTO.setRate(Double.parseDouble(vo.getRate()));
			  //use SErvice
			 String resultMsg=service.registerCustomer(custDTO);
			 return resultMsg;
			
		}
		

}
