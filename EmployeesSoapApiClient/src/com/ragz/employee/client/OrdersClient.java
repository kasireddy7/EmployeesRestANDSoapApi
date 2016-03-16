package com.ragz.employee.client;

import com.ragz.ws.employee.EmployeeWebService;
import com.ragz.ws.employee.EmployeeWebServiceService;

public class OrdersClient {
	public static void main(String[] args) {
		EmployeeWebServiceService employeeWebServiceService = new EmployeeWebServiceService() ;
		EmployeeWebService employeeWebService = employeeWebServiceService.getEmployeeWebServicePort();
		System.out.println(employeeWebService.getAllEmployees());
	}
}
