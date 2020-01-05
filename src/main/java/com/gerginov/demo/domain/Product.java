package com.gerginov.demo.domain;

import com.gerginov.demo.domain.enums.Type;

import javax.persistence.*;

@Entity
@Table
public class Product extends BaseEntity {

    private String title;

    private String description;

    private Double price;

    private Type type;

    public Product() {
    }


    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(nullable = false)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
