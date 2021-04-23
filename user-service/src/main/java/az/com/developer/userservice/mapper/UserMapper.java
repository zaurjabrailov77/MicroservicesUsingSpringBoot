package az.com.developer.userservice.mapper;


import az.com.developer.userservice.domain.dto.UserDto;
import az.com.developer.userservice.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    List<UserDto> toUserDtoList (List<User> users);
    UserDto toUserDto (User user);
    User toUser (UserDto userDto);

}
