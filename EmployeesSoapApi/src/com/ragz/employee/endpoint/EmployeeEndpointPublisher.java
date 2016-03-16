/**
 * 
 */
package com.ragz.employee.endpoint;

import javax.xml.ws.Endpoint;

import com.ragz.ws.employee.EmployeeWebService;

/**
 * @author rreddy
 *
 */
public class EmployeeEndpointPublisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/EmployeesSoapApi/Employees", new EmployeeWebService());
		

	}

}
