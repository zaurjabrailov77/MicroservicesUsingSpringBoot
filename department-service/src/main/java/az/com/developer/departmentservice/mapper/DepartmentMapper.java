package az.com.developer.departmentservice.mapper;

import az.com.developer.departmentservice.domain.dto.DepartmentDto;
import az.com.developer.departmentservice.domain.entity.Department;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper
public interface DepartmentMapper {

    List<DepartmentDto> toDepartmentDtoList (List<Department> departments);
    DepartmentDto toDepartmentDto (Department department);
    Department toDepartment (DepartmentDto departmentDto);

}
