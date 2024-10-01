package com.example.oraclebackendtest.repository;

import com.example.oraclebackendtest.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
