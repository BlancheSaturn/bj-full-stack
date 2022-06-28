package com.example.course;

import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@NoArgsConstructor

public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String company;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String currency;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private String duration;
    @Column(nullable = false)
    private String summary;

    public Courses(String name, String location, double price, String duration, String summary, String company, String currency) {
        this.company = company;
        this.name = name;
        this.location = location;
        this.currency = currency;
        this.price = price;
        this.duration = duration;
        this.summary = summary;
    }

    public int getId() {
        return id;
    }
    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCurrency() {
        return currency;
    }

    public double getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getSummary() {
        return summary;
    }
}


