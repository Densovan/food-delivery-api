package com.sovanden.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@Slf4j
public class UserHandlerService {
    public void userNameHasText(String username){
        if(StringUtils.hasText(username)){
            return ;

        }
        log.info("User name is valid");
        throw new IllegalArgumentException("User name is not valid");
    }

    public void phoneNumberHasText(String phoneNumber){
        if(StringUtils.hasText(phoneNumber)){
           return;
        }
        log.info("Phone number is valid");
        throw new IllegalArgumentException("Phone number is not valid");
    }
}
