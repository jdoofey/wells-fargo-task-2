package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private Long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(String name, String category, String purchaseDate,
                    double purchasePrice, int quantity)
