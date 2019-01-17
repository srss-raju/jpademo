package com.example.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpademo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
