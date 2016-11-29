/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.dao;

/**
 *
 * @author Spunk
 */
import java.util.List;

import com.payroll.model.Employee;

public interface EmployeeDao {
    
    public List<Employee> listEmployee();
    
    public void insertEmployee(Employee employee);

    public void deleteEmployee(Integer employeeId);
}
