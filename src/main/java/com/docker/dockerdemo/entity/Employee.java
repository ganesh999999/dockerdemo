package com.docker.dockerdemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@JsonProperty
	private int empId;
	@JsonProperty
	private int age;
	@JsonProperty
	private int deptId;
	@JsonProperty
	private String name;
	@JsonProperty
	private int orgCode;
	@JsonProperty
	private int roleId;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonProperty
	private Address address;

	
	
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getDeptId() {
		return deptId;
	}



	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getOrgCode() {
		return orgCode;
	}



	public void setOrgCode(int orgCode) {
		this.orgCode = orgCode;
	}



	public int getRoleId() {
		return roleId;
	}



	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", deptId=" + deptId + ", name=" + name + ", orgCode="
				+ orgCode + ", roleId=" + roleId + ", address=" + address + "]";
	}

	

}
