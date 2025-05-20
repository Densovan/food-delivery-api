package com.sovanden.model;

import com.sovanden.enums.UserType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    private String firstName;
    private String lastName;

    @Column(name = "gender", length = 10)
    private String gender;
    private String dateOfBirth;

    @Column(name = "phone_number", unique = true, nullable = false,length = 15)
    private String phoneNumber;
    private String email;
    private String address;

    @Column(name = "user_type")
    private UserType userType;
    private String status;
}
