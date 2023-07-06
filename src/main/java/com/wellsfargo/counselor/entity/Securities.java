package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

public class Securities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int securityId;
    @Column(nullable = false)
    private String securityName;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Date purchaseDate;
    @Column(nullable = false)
    private Date purchasePrice;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name =  "portfolioId",nullable = false)
    private Portfolio portfolio;

    protected Securities() {
    }

    public Securities(String securityName, String category, Date purchaseDate, Date purchasePrice, int quantity, Portfolio portfolio) {
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public int getSecurityId() {
        return securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Date purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
