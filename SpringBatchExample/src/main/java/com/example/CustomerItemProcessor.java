package com.example;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {

    public Customer process(Customer customer) throws Exception {
        System.out.println("CustomerItemProcessor: ____________ " + customer);
        return customer;
    }
}
