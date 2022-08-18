package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	//DummyEmployee List
	List<Employee>list=List.of(
			
		new Employee(1311L,"Peter","142363473"),
		new Employee(1312L,"john","142363475"),
		new Employee(1313L,"Parker","142363573"),
		new Employee(1314L,"michel","142366473"),
		new Employee(1315L,"jihnson","142333473")

			
			
			);
			

	@Override
	public Employee getEmployee(Long id) {
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
