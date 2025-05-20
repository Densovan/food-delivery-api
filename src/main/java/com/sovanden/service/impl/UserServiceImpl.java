package com.sovanden.service.impl;

import com.sovanden.dto.UserRequest;
import com.sovanden.dto.UserResponse;
import com.sovanden.model.User;
import com.sovanden.repository.DeviceRepository;
import com.sovanden.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.sovanden.service.UserHandlerService;
import com.sovanden.service.UserService;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final ModelMapper modeMapper;
    private final UserRepository userRepository;
    private final DeviceRepository deviceRepository;
    private final UserHandlerService userHandlerService;

    public UserServiceImpl(UserRepository userRepository,
                           DeviceRepository deviceRepository,
                           UserHandlerService userHandlerService,
                           ModelMapper modeMapper) {
        this.userRepository = userRepository;
        this.deviceRepository = deviceRepository;
        this.userHandlerService = userHandlerService;
        this.modeMapper = modeMapper;
    }


    @Override
    public UserResponse create(UserRequest userRequest) {
        log.info("requeset user {}",userRequest);
       userHandlerService.userNameHasText(userRequest.getUsername());
       userHandlerService.phoneNumberHasText(userRequest.getPhoneNumber());

       User user = modeMapper.map(userRequest, User.class);
       log.info("creating user: {}",user);
        userRepository.save(user);
        return null;
    }

    @Override
    public UserResponse update(long id, UserRequest userRequest) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<UserResponse> findAll() {
        return List.of();
    }

    @Override
    public UserResponse findOne(long id) {
        return null;
    }
}
