package com.cydeo.bootstrap;

import com.cydeo.entity.Merchant;
import com.cydeo.entity.Payment;
import com.cydeo.entity.PaymentDetail;
import com.cydeo.enums.Status;
import com.cydeo.repository.MerchantRepository;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Payment payment1 = new Payment(new BigDecimal("150000"),LocalDate.of(2016,12,3), Status.SUCCESS);
        Payment payment2 = new Payment(new BigDecimal("250000"),LocalDate.of(2018,3,7), Status.FAILURE);

        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"),new BigDecimal("100000"),LocalDate.of(2018,11,11));
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("80000"),new BigDecimal("150000"),LocalDate.of(2019,4,3));


        payment1.setPaymentDetail(paymentDetail1);
        payment2.setPaymentDetail(paymentDetail2);

        Merchant merchant1 = new Merchant("AmazonSubMerchant","M123",new BigDecimal("0.25"),new BigDecimal("3.25"),3);

        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        merchantRepository.save(merchant1);


        paymentRepository.save(payment1);
        paymentRepository.save(payment2);

    }
}
