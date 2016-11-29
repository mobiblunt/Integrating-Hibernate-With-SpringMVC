/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.service;

import java.util.List;
import com.payroll.dao.EmployeeDao;
import com.payroll.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeDao employeeDao;
@Override
public List<Employee> listEmployee() {
return this.employeeDao.listEmployee();
}

public void insertEmployee(Employee employee) {
		this.employeeDao.insertEmployee(employee);
	}

public void deleteEmployee(Integer employeeId) {
		this.employeeDao.deleteEmployee(employeeId);
	}
    
}
