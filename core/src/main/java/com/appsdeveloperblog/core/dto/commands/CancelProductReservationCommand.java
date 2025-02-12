package com.appsdeveloperblog.core.dto.commands;

import java.util.UUID;

/*
Class used across multiple microservices to handle information when a Product Reservation is CANCELED
 */
public class CancelProductReservationCommand {

    private UUID productId;
    private UUID orderId;
    private Integer productQuantity;

    public CancelProductReservationCommand() {
    }

    public CancelProductReservationCommand(UUID productId, UUID orderId, Integer productQuantity) {
        this.productId = productId;
        this.orderId = orderId;
        this.productQuantity = productQuantity;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
}
