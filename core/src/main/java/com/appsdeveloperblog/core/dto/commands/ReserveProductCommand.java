package com.appsdeveloperblog.core.dto.commands;

import java.util.UUID;

/*
This command will be used in different microservices, thats why is created as part of a library and not every time in each one of the microservices
 */
public class ReserveProductCommand {
    private UUID productId;
    private Integer productQuantity;
    private UUID orderId;

    public ReserveProductCommand() {
    }

    public ReserveProductCommand(UUID productId, Integer productQuantity, UUID orderId) {
        this.productId = productId;
        this.productQuantity = productQuantity;
        this.orderId = orderId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
}
