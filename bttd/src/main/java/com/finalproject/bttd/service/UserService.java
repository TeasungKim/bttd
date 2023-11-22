package com.finalproject.bttd.service;

import com.finalproject.bttd.configuration.SecurityConfig;
import com.finalproject.bttd.dto.UserDto;
import com.finalproject.bttd.entity.User;
import com.finalproject.bttd.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;
    PasswordEncoder passwordEncoder;
    @Transactional
    public User create(UserDto userDto) {
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    User user = userDto.toEntity();
   //     System.out.println(user.getUser_password());
   String newPassword = passwordEncoder.encode(user.getUser_password());
    user.setUser_password(newPassword);
    if(user.getUser_id() == null){
        return null;
    }
    return userRepository.save(user);
    }


    //
}
