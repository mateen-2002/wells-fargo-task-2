package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int portfolioId;
    @Column(nullable = false)
    private String portfolioName;
    @ManyToOne
    @JoinColumn(name = "clientId",nullable = false)
    private Client client;

    public Portfolio(String portfolioName, Client client) {
        this.portfolioName = portfolioName;
        this.client = client;
    }

    protected Portfolio() {

    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
