package com.example;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerItemWriter implements ItemWriter<Customer>{

    public  void write(List<? extends Customer> items) throws Exception {
        System.out.println("CustomerItemWriter: ______________" +items);
    }
}
