package com.sovanden.controller;

import com.sovanden.dto.UserRequest;
import com.sovanden.dto.UserResponse;
import com.sovanden.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@Slf4j
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;

    @PostMapping(value = "v1/users", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest){
        log.info("creating user {}",userRequest);

        userService.create(userRequest);
        return ResponseEntity.ok().build();
    }
}
