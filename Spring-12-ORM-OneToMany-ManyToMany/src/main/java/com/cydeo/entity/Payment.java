package com.cydeo.entity;

import com.cydeo.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "payments")
public class Payment extends BaseEntity{

    private BigDecimal amount;

    @Column(columnDefinition = "Date")
    private LocalDate createdDate;

    private Status paymentStatus;

    @OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "paymentDetail_id")
    private PaymentDetail paymentDetail;

    @ManyToOne
    private  Merchant merchant;

    @ManyToOne
    private  Customer customer;


    public Payment(BigDecimal amount, LocalDate createdDate, Status paymentStatus) {
        this.amount = amount;
        this.createdDate = createdDate;
        this.paymentStatus = paymentStatus;
    }


}
