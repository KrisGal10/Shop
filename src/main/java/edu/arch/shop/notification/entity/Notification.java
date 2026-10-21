package edu.arch.shop.notification.entity;

import edu.arch.shop.customer.entity.Customer;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Data
@NoArgsConstructor
public class Notification {

    @Id
    private Long id;

    @Column(nullable = false, length = 100)
    private Long customerID;

    @Column(nullable = false, length = 300)
    private String message;

    @Column(nullable = false)
    private LocalDateTime time;

    public Notification(Long id, Long customerID, String message, LocalDateTime time) {
        this.id = id;
        this.customerID = customerID;
        this.message = message;
        this.time = time;
    }
}
