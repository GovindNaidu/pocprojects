package com.walmart.responses;

import java.util.List;

import com.walmart.entities.Employee;

import lombok.Data;

@Data
public class ApiResponse {
	

	private Integer statusCode;
	private List<Employee> emplist;
	private String message;
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ApiResponse(Integer statusCode, List<Employee> emplist, String message) {
		super();
		this.statusCode = statusCode;
		this.emplist = emplist;
		this.message = message;
	}
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ApiResponse [statusCode=" + statusCode + ", emplist=" + emplist + ", message=" + message + "]";
	}
	
	//private String addAccountMsg;
	
	
	
	
	
	
}
