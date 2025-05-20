package com.sovanden.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sovanden.enums.UserType;
import jakarta.persistence.Entity;
import lombok.*;


import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private Long id;
    private String username;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String gender;
    @JsonProperty("dob")
    private String dateOfBirth;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String email;
    private String address;
    @JsonProperty("user_type")
    private UserType userType;
    private String status;
    @JsonProperty("device_info")
    private DeviceRequest deviceRequest;

    @Getter
    @Setter
    @ToString
    public static class DeviceRequest{
        @JsonProperty("device_id")
        private String deviceId;
        @JsonProperty("device_type")
        private String deviceType;
        @JsonProperty("device_model")
        private String deviceModel;
        @JsonProperty("os_version")
        private String osVersion;
        @JsonProperty("app_version")
        private String appVersion;
        @JsonProperty("last_login")
        private Date lastLogin;
        @JsonProperty("trust_device")
        private Boolean trustDevice;
    }
}
