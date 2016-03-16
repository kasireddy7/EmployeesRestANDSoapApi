package com.ragz.ws.employee;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ragz.vo.EmployeeVo;

@WebService
public class EmployeeWebService {
	@WebMethod
	public List<EmployeeVo> getAllEmployees() {

		List<EmployeeVo> list = new ArrayList<EmployeeVo>();
/*		list.add(new OrderVO(1, "Graphic"));
		list.add(new OrderVO(2, "Normal"));
*/		return list;
	}

	@WebMethod
	public boolean saveEmployee(EmployeeVo employee) {
		System.out.println("Saving new emp: " + employee);
		return true;
	}
}
