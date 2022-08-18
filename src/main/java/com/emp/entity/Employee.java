package com.emp.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private String phone;

	public List<Record> records = new ArrayList<>();

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Employee(int id, String name, String phone, List<Record> records) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.records = records;
	}

	public Employee() {
		super();
	}

}
