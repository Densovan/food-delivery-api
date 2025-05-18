package com.sovanden.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_feedback")
public class Feedback extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment", length = 255)
    private String comment;

    private Double rating;
    private Date feedbackDate;
    private Long userId;
    private Long restaurantId;
    private Long orderId;
    private Long deliveryId;

}
