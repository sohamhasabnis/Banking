package com.lti.core.services;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.core.daos.EmpDao;
import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;
/*
 *  The InitializingBean interface imposes implementation of afterPropertiesSet()
 *  Spring container calls this method after injections.
 *  Purpose of the method
 *  	* To ensure Spring side initialization
 * 		* To validate Spring configuration
 * */
@Service("empService")
//@Scope("prototype")
public class EmpServiceImpl implements EmpService {
	public EmpServiceImpl() {
		System.out.println("obj created");
	}
	
	//Field Injection - Here Spring populates the refrence from dao layer@Autowired
	//by default goes by name if not found goes by type
	@Resource(name="empDao")  
	private EmpDao dao;
	
	@Override
	public List<Employee> getAllEmps() throws EmpException{
		return dao.getAllEmps();
	}
	
	@Override
	public Employee getEmployeeDetails(int empId) throws EmpException {
		
		return dao.getEmpOnId(empId);
	}

	/*@Override
	public int joinNewEmployee(Employee emp) throws EmpException {
		return dao.insertNewEmployee(emp);
	}*/
}
