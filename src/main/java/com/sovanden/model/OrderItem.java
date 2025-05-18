package com.sovanden.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private double price;
    private Long menuItemId;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id")
    private Order order;


}
