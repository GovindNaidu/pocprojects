package com.walmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.dto.EmployeeDTO;
import com.walmart.entities.Employee;
import com.walmart.repositories.EmployeeDAO;

@Service
public class EmpServiceImpl {
	
	@Autowired
	EmployeeDAO employeedao;
	
	public List<Employee> getAllResources() {
		EmployeeDTO empdto = new EmployeeDTO();

		List<Employee> allEmployees =(List<Employee>) employeedao.findAll();

//		List<Employee> allEmployees = employeedao.findAllEmployees();

		return allEmployees;

	}
	
	public String addEmployee(EmployeeDTO empDTO) {
		Employee empEntity = new Employee();
		String status = "success";
		empEntity.setEmpId(empDTO.getEmpId());
		empEntity.setEmpFirstName(empDTO.getEmpFirstName());
		empEntity.setEmpLastName(empDTO.getEmpLastName());
		empEntity.setDepartment(empDTO.getDepartment());
		empEntity.setAge(empDTO.getAge());
		empEntity.setSalary(empDTO.getSalary());
		empEntity.setDateOfBirth(empDTO.getDateOfBirth());
		empEntity.setDateOfJoining(empDTO.getDateOfJoining());
		
		/*
		 * 
		 * 
		 * Optional<Employee> emp = employeedao.findfindById(empDTO.getEmpId());
		 * 
		 * if (emp == null) { employeedao.save(empEntity); } else { status = "failure";
		 * }
		 */
		 
		 employeedao.save(empEntity);
		return status;
	}
	
	
	
	public String updateEmployee(EmployeeDTO empDTO) {
		Employee empEntity = new Employee();
		String status = "success";
		empEntity.setEmpId(empDTO.getEmpId());
		empEntity.setEmpFirstName(empDTO.getEmpFirstName());
		empEntity.setEmpLastName(empDTO.getEmpLastName());
		empEntity.setDepartment(empDTO.getDepartment());
		empEntity.setAge(empDTO.getAge());
		empEntity.setDateOfBirth(empDTO.getDateOfBirth());
		empEntity.setDateOfJoining(empDTO.getDateOfJoining());
		employeedao.save(empEntity);

		return "success";

	}
	
	public String deleteEmployee(int empId) {
		Employee empEntity = new Employee();
		employeedao.deleteById(empId);
		return "success";
	}
	
	

}
