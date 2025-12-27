package com.examly.springapp.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerReturn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerReturnId;

    private LocalDateTime returnDate;
    private int quantity;
    private String reason;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public CustomerReturn() {}

    public CustomerReturn(int customerReturnId, LocalDateTime returnDate,
                          int quantity, String reason, Product product) {
        this.customerReturnId = customerReturnId;
        this.returnDate = returnDate;
        this.quantity = quantity;
        this.reason = reason;
        this.product = product;
    }

    public int getCustomerReturnId() {
        return customerReturnId;
    }

    public void setCustomerReturnId(int customerReturnId) {
        this.customerReturnId = customerReturnId;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
