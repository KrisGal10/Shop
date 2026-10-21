package edu.arch.shop.notification.dto;

import java.math.BigDecimal;

public record CustomerRequest(
        String customerName,
        String productName,
        Integer quantity,
        BigDecimal unitPrice
) {
}
