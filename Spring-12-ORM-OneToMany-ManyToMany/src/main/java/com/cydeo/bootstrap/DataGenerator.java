package com.cydeo.bootstrap;

import com.cydeo.entity.*;
import com.cydeo.enums.Status;
import com.cydeo.repository.*;
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
    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;
    private  final CartRepository cartRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository, ItemRepository itemRepository, CartRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
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

        Customer customer1 = new Customer("msmith","Mike","Smith","msmith@gmail.com","123 str localcity");

        payment1.setCustomer(customer1);
        payment2.setCustomer(customer1);

        customerRepository.save(customer1);

        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        Item item1= new Item("Milk","M001");
        Item item2= new Item("Bread","B001");
        Item item3= new Item("EGG","E001");
        Item item4= new Item("Water","W001");

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.setItemList(Arrays.asList(item1,item2,item3));
        cart2.setItemList(Arrays.asList(item2,item4));

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemRepository.save(item4);

        cartRepository.save(cart1);
        cartRepository.save(cart2);

        merchantRepository.save(merchant1);


        paymentRepository.save(payment1);
        paymentRepository.save(payment2);

    }
}
