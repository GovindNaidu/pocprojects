package com.walmart.dto;

import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EmployeeDTO {
	
	
	private Integer empId;
	 
	@NotNull(message="First name cannot be missing or empty")
    @Size(min=2, message="First name must not be less than 2 characters")
	 private String empFirstName;

    @NotNull(message="Last name cannot be missing or empty")
    @Size(min=2, message="Last name must not be less than 2 characters")
	 private String empLastName;

    @NotNull(message="Last name cannot be missing or empty")
	  private String department;
	  
    @Min(value = 1, message = "Id can't be less than 1 or bigger than 99")
    @Max(99)
	  private Integer age;
	  
    @Min(value = 1000, message = "Id can't be less than 1000 or bigger than 99999")
    @Max(99999)
	  private Double salary;
	  
	  @NotNull
	  private Date dateOfBirth;
	  @NotNull
	 private Date dateOfJoining;
	 
	
	public EmployeeDTO(Integer empId, String empFirstName, String empLastName, String department, Integer age,
			Double salary, Date dateOfBirth, Date dateOfJoining) {
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




	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	 
	 
	 
	 
}
