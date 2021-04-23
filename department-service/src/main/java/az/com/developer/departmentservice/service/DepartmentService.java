package az.com.developer.departmentservice.service;

import az.com.developer.departmentservice.domain.dto.DepartmentDto;
import az.com.developer.departmentservice.domain.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDto> findAll();
    Department save(DepartmentDto departmentDto);

}
