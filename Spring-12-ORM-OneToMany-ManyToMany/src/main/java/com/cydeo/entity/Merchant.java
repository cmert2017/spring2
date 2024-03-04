package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "merchants")
public class Merchant  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;
    private  String code;
    private BigDecimal transactionFee;
    private  BigDecimal commissionRate;
    private  int payoutDelayCount;

    @OneToMany(mappedBy = "merchant") //in onetomany relation, ownership belongs to many side
    private List<Payment> paymentList;


    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, int payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }
}
