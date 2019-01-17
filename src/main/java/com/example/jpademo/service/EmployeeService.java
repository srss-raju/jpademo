package com.example.jpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpademo.entity.Employee;
import com.example.jpademo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepository;

	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}
}
