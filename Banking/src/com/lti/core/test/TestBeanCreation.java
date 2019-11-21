package com.lti.core.test;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;
import com.lti.core.services.EmpService;
public class TestBeanCreation {
	
	public static void main(String args[]) {	
		//System.out.println(services.toString());
		//creating a spring context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmpService service = ctx.getBean("empService",EmpService.class);
		try {
			/*List<Employee> empList = service.getAllEmps();
			for(Employee emp:empList)
			{
				System.out.println(emp);
			}
			Employee emp = service.getEmployeeDetails(100);
			System.out.println(emp);*/
			
			Employee emp = new Employee();
			emp.setEmployeeId(301);
			emp.setFirstName("Soham");
			emp.setLastName("Hasabnis");
			emp.setEmail("sohamhasabnis@abc.xyz");
			emp.setJobId("AC_ACCOUNT");
			emp.setSalary(1200);
			java.util.Date dt = new java.util.Date();
			emp.setHireDate(new Date(dt.getTime()));
			emp = service.getEmployeeDetails(100);
			//int val = service.joinNewEmployee(emp);
			System.out.println(emp);
		} catch (EmpException e) {
			e.printStackTrace();
		}

		/*Address adr = (Address)ctx.getBean("addr");
		System.out.println(adr.toString());*/
		
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext)ctx;
		cctx.close();
	}	
}