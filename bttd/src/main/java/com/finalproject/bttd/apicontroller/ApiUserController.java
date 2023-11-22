package com.finalproject.bttd.apicontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finalproject.bttd.annotation.RunningTime;
import com.finalproject.bttd.dto.UserDto;
import com.finalproject.bttd.entity.User;
import com.finalproject.bttd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

@Slf4j
@RestController
public class ApiUserController {
    @Autowired
    private UserService userService;


    @PostMapping("/api/user")
    public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {

        User created = userService.create(userDto);
        return new ResponseEntity<>("{\"data\":{\"success\":true}}", HttpStatus.OK);
    }





//
}
