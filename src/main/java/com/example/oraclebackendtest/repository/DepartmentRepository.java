package com.example.oraclebackendtest.repository;

import com.example.oraclebackendtest.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
