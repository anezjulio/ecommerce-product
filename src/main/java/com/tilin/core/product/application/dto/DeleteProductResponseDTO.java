package com.tilin.core.product.application.dto;

public class DeleteProductResponseDTO {
    private String message;

    public DeleteProductResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
