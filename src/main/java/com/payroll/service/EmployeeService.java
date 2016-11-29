/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.service;

/**
 *
 * @author Spunk
 */
import java.util.List;

import com.payroll.model.Employee;

public interface EmployeeService {
    
    public void insertEmployee(Employee employee);
    
    //public void addEmployee(Employee employeee);
    
    public void deleteEmployee(Integer employeeId);
    
    public List<Employee> listEmployee();
}
