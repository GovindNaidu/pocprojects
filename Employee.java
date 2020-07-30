
  package com.walmart.entities; 
  //import java.util.Date;
  
  
  import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
  
  @Entity
  @Data
  @Table(name ="Employee_wm") 
  public class Employee {
  
  @Id
  @Column(name="Employee_ID") 
  private Integer empId;
  
  @Column(name="EmpFirst_Name") 
  private String empFirstName;

  @Column(name="EmpLast_Name") 
  private String empLastName;
  
  @Column(name="Department") 
  private String department;
  
  @Column(name="Age") 
  private Integer age;
  
  @Column(name="Salary") 
  private Double salary;
  
  @Column(name="DateOfBirth") 
  private Date dateOfBirth;
   
  @Column(name="DateOfJoining") 
  private Date dateOfJoining;

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getEmpFirstName() {
	return empFirstName;
}

public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}

public String getEmpLastName() {
	return empLastName;
}

public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public Date getDateOfJoining() {
	return dateOfJoining;
}

public void setDateOfJoining(Date dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}

public Employee(Integer empId, String empFirstName, String empLastName, String department, Integer age, Double salary,
		Date dateOfBirth, Date dateOfJoining) {
	super();
	this.empId = empId;
	this.empFirstName = empFirstName;
	this.empLastName = empLastName;
	this.department = department;
	this.age = age;
	this.salary = salary;
	this.dateOfBirth = dateOfBirth;
	this.dateOfJoining = dateOfJoining;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
			+ ", department=" + department + ", age=" + age + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth
			+ ", dateOfJoining=" + dateOfJoining + "]";
}
  
  
  
  
  }
 