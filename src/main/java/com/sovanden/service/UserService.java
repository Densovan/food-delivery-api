package com.sovanden.service;

import com.sovanden.dto.UserRequest;
import com.sovanden.dto.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse create(UserRequest userRequest);
    UserResponse update(long id,UserRequest userRequest);
    void delete(long id);
    List<UserResponse> findAll();
    UserResponse findOne(long id);
}
