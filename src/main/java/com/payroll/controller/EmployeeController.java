/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.controller;

import com.payroll.exception.GenericException;
import com.payroll.model.Employee;
import com.payroll.service.EmployeeService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping({"/","/employee"})
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    
    @RequestMapping(method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {
    model.addAttribute("employeesList", employeeService.listEmployee());
    return "employee";
    }
    
    @RequestMapping(value = "/addemployee", method = RequestMethod.GET)
    public ModelAndView addEmployee(ModelMap model) {
    return new ModelAndView("addemployee", "command", new Employee());
    }
    
    @RequestMapping(value = "/updatemployee", method = RequestMethod.POST)
    public String updateEmployee(@ModelAttribute("employeeForm") Employee employee, ModelMap model) {
    this.employeeService.insertEmployee(employee);
    model.addAttribute("employeesList", 
    employeeService.listEmployee());
    return "employee";
    }
    @RequestMapping(value = "/delete/{empId}", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable("empId") Integer empId,ModelMap model) {
    this.employeeService.deleteEmployee(empId);
    model.addAttribute("employeesList", employeeService.listEmployee());
    return "employee";
    }
       
//    @RequestMapping("/testIOException")
//    public String testIOException(ModelMap model) throws IOException {
//        if (true) {
//            throw new IOException("This is an IO Exception");
//        }
//        return "hello";
//    }
//    @RequestMapping("/testGenericException")
//    public String testGenericException(ModelMap model) throws IOException {
//    if (true) {
//    // add custom code and message that appear to error page
//    throw new GenericException("R333", "This is a custom message");
//    }
//    return "hello";
//    }
}   


