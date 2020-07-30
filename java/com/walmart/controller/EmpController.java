package com.walmart.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.dto.EmployeeDTO;
import com.walmart.entities.Employee;
import com.walmart.responses.ApiResponse;
@RestController
@RequestMapping(value = "/employee") 
public class EmpController {
	
	  @Autowired
	  com.walmart.services.EmpServiceImpl employeeService;
	
	  //get log4j handler
	  private static final Logger logger = Logger.getLogger(EmpController.class);

	  @RequestMapping(method = RequestMethod.GET, value = "/getAll")
		public ResponseEntity<ApiResponse> getAllResources() {
			ApiResponse apiResponse = new ApiResponse();

			try {
				List<Employee> emplist = employeeService.getAllResources();
					apiResponse.setStatusCode(200);
					apiResponse.setMessage("List of employees...");
					apiResponse.setEmplist(emplist);
			} catch (Exception e) {
				logger.error(e);
			}

			return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);

		}
	  
	  @RequestMapping(method = RequestMethod.POST, value = "/add") public
		ResponseEntity<ApiResponse> addToBench(@RequestBody EmployeeDTO emp) {

	ApiResponse apiResponse = new ApiResponse();

	try {
		String status = employeeService.addEmployee(emp);
		if (status.equals("success")) {
			apiResponse.setStatusCode(200);
			apiResponse.setMessage("Employee Details added successfully...");
		} else {
			apiResponse.setStatusCode(200);
			apiResponse.setMessage("Duplicate Employee ID already exists...");
		}
	} catch (Exception e) {
		logger.error(e);
	}

	return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);

}
	  
	  @RequestMapping(method = RequestMethod.PUT, value = "/update") 
public ResponseEntity<ApiResponse> editEmployee(@RequestBody EmployeeDTO emp) {

	ApiResponse apiResponse = new ApiResponse();

	try {
		String status = employeeService.updateEmployee(emp);
		if (status.equals("success")) {
			apiResponse.setStatusCode(200);
			apiResponse.setMessage("Employee Details edited successfully...");
		} 
	} catch (Exception e) {
		logger.error(e);
	}
	return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);

}  
	  
	   @RequestMapping(value= "/delete/{id}", method= RequestMethod.DELETE)
	    public ResponseEntity<ApiResponse> deleteEmployeeById(@PathVariable int id)  {
			ApiResponse apiResponse = new ApiResponse();
			try {
			String status = employeeService.deleteEmployee(id);
			if (status.equals("success")) {
				apiResponse.setStatusCode(200);
				apiResponse.setMessage("Employee Details deleted successfully...");
			} 
			}catch(Exception e)
			{
				logger.error(e);
			}
			return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);

	
	    }
}
