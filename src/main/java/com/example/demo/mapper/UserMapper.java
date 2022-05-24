package com.example.demo.mapper;

import com.example.demo.Dtos.UserDto;
import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserMapper {

    public static User toEntity(UserDto udto) {
        User user = new User();
        user.setEmail(udto.getEmail());
        user.setUsarName(udto.getUsarDtoName());
        return user;
    }

    public static UserDto toDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsarDtoName(user.getUsarName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    public static List<UserDto> toDtoist(List<User> uList){
        List<UserDto> userDtoList = new ArrayList<>();
        Iterator<User> it = uList.iterator();
        while(it.hasNext()){
            UserDto u =toDto(it.next());
            userDtoList.add(u);
        }
        return userDtoList;
    }

    public static List<User> toEntityList(List<UserDto> userDtoList){
        List<User> userList = new ArrayList<>();
        Iterator<UserDto> it = userDtoList.iterator();
        while (it.hasNext()){
            User u=toEntity(it.next());
            userList.add(u);
        }

        return userList;
    }
}
