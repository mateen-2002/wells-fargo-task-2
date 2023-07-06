package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientId;
    @Column(nullable = false)
    private String clientName;
    @Column(nullable = false)
    private String clientEmail;
    @ManyToOne
    @JoinColumn(name = "advisorId",nullable = false)
    private Advisor advisor;

    public Client(String clientName, String clientEmail, Advisor advisor) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.advisor = advisor;
    }

    protected Client() {

    }

    public int getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
