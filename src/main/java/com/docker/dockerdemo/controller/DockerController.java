package com.docker.dockerdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dockerdemo.entity.Employee;
import com.docker.dockerdemo.repository.EmployeeRepository;

@RestController
public class DockerController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping
	public String getString() {
		return "it is working fine with webhook (autobuild)";
	}
	
	@GetMapping("/employeeOutById/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id){
		System.out.println("Employee : "+employeeRepository.findById(id));
		return employeeRepository.findById(id);
	}
	
}
