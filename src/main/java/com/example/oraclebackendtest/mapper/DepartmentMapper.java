package com.example.oraclebackendtest.mapper;

import com.example.oraclebackendtest.dto.DepartmentDto;
import com.example.oraclebackendtest.Entity.Department;

public class DepartmentMapper {
    //CONVERTIR LA ENTIDAD JPA DEPARTMENT EN UN DTO
    public static DepartmentDto mapToDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    public static Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentdescription()
        );
    }
}
