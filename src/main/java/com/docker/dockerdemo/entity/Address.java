package com.docker.dockerdemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@JsonProperty
	private int addId;
	@JsonProperty
	private String addLine1;
	@JsonProperty
	private String addLine2;

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addLine1=" + addLine1 + ", addLine2=" + addLine2 + "]";
	}

}
