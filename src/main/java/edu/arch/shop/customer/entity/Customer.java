package edu.arch.shop.customer.entity;

import edu.arch.shop.order.entity.Order;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    private String secondName;

    private String surname;

    private String email;

    private String phoneNumber;

    @OneToMany
    @JoinColumn(name = "order_id")
    private Order order;




}
