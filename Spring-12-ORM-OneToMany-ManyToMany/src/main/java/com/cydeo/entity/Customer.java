package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="customers")
public class Customer extends BaseEntity{

    private String userName;
    private String name;
    private String surName;
    private String email;
    private String address;


    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)  //it is very important for performance issue. for example Not to bring all the details from merchant table
    private List<Payment> paymentList;

    public Customer(String userName, String name, String surName, String email, String address) {
        this.userName = userName;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
    }
}
