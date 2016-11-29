/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
@Column(name = "ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(name = "FIRST_NAME")
private String firstName;
@Column(name = "LAST_NAME")
private String lastName;
@Column(name = "JOB_TITLE")
private String jobTitle;
@Column(name = "DEPARTMENT")
private String department;
@Column(name = "SALARY")
private int salary;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
@Override
public boolean equals(Object obj) {
if (this == obj) {
return true;
}
if (!(obj instanceof Employee)) {
return false;
}
Employee employee = (Employee) obj;
if (firstName != null ? !firstName.equals(employee.firstName): employee.firstName != null) {
return false;
} else {
return true;
}
}
@Override
public int hashCode() {
return firstName != null ? firstName.hashCode() : 0;
}
@Override
public String toString() {
return "Employee [id=" + id + ", name=" + firstName + "" 
+ lastName
+ ", jobTitle=" + jobTitle + " department=" 
+ department
+ " salary=" + salary + "]";
}
}