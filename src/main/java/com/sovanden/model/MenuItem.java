package com.sovanden.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_menu_item")
public class MenuItem extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String code;
    private Double price;
    private Integer availability;

    @ManyToOne
//    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}
