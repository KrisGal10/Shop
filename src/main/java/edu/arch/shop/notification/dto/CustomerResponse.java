package edu.arch.shop.notification.dto;

import java.math.BigDecimal;

public record CustomerResponse(
        Long id,
        String customerName,
        String productName,
        Integer quantity,
        BigDecimal unitPrice,
        BigDecimal totalPrice
) {
}
