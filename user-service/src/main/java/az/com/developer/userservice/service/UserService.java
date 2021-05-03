package az.com.developer.userservice.service;


import az.com.developer.userservice.domain.dto.UserDto;
import az.com.developer.userservice.domain.entity.User;
import az.com.developer.userservice.valueobject.ResponseTemplateVO;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    User save(UserDto userDto);
    UserDto findById(Long id);

    ResponseTemplateVO getUserWithDepartment(Long userId);

}
