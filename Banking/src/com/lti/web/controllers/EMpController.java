package com.lti.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;
import com.lti.core.services.EmpService;

//http://localhost:9090/Spring008_MvcSpringJPA/empList.hr
//http://localhost:9090/Spring009_MvcRestJpa/home.hr
//@Controller
@RestController
@RequestMapping("/hr")
public class EMpController {
	
	@Autowired
	private EmpService service;
	
	@RequestMapping(value="/empList.hr",method=RequestMethod.GET,produces="application.json")
	public List<Employee> getEmpList(Model model) throws EmpException {
	 	
		List<Employee> empList;
		
		empList = service.getAllEmps();
		
		return empList;
	}
	
//	http://localhost:9090/Spring007_MvcSpringJDBC/empDetails.hr?id=300
	/*@RequestMapping("empDetails.hr")
	public ModelAndView getEmpDetails(@RequestParam("id") int empId) throws EmpException {
		Employee emp = service.getEmployeeDetails(empId);
		
		String jspName="empDetails";
		ModelAndView mAndV= new ModelAndView();
		mAndV.addObject("emp",emp);
		mAndV.setViewName(jspName);
		return mAndV;
	}*/
}
