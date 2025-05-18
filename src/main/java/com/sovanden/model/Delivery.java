package com.sovanden.model;

import com.sovanden.enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date pickupTime = new Date();

    @Temporal(TemporalType.TIME)
    private Date deliveryTime = new Date();

    private String pickupAddress;
    private String deliveryAddress;
    private Double deliveryFee;
    private DeliveryStatus deliveryStatus;
    private Long orderId;
    private Long deliveryPartnerId;

}
