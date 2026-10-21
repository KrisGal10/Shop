package edu.arch.shop.notification.repository;

import edu.arch.shop.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Order, Long> {
}
