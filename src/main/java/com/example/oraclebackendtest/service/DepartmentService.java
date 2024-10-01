package com.example.oraclebackendtest.service;

import com.example.oraclebackendtest.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto addDepartment(DepartmentDto departmentDto);
    DepartmentDto updateDepartment(Long departmentId,DepartmentDto departmentDto);
    void deleteDepartment(Long departmentId);
    List<DepartmentDto> getAllDepartments();
    DepartmentDto getDepartmentById(Long id);
}
