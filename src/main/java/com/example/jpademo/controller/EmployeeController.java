package com.example.jpademo.controller;

import java.util.List;
import java.util.Optional;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.entity.Employee;
import com.example.jpademo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.create(employee);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.update(employee);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Employee> getEmployee(@PathVariable Long  id) {
		return employeeService.findById(id);
	}
	
	@GetMapping
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
		employeeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
