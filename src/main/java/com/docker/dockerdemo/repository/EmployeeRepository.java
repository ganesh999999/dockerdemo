package com.docker.dockerdemo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.dockerdemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
