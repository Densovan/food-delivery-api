package com.sovanden.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sovanden.enums.UserType;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String username;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String gender;
    @JsonProperty("dob")
    private Date dateOfBirth;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String email;
    private String address;
    @JsonProperty("user_type")
    private UserType userType;
    private String status;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("updated_by")
    private String updatedBy;
}
