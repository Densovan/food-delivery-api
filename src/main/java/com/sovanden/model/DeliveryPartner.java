package com.sovanden.model;

import com.sovanden.enums.VehicleType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_delivery_partner")
public class DeliveryPartner extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;

    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;

    private String email;
    private Date dateOfBirth;
    private String address;
    private String gender;
    private VehicleType vehicleType;
    private Boolean available;


}
