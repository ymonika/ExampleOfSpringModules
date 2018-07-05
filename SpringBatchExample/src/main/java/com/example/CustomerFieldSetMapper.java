package com.example;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;

@Component
public class CustomerFieldSetMapper implements FieldSetMapper<Customer> {

    public Customer mapFieldSet(FieldSet fieldSet) throws BindException{
        Customer customer = new Customer(fieldSet.readString("customerId"), fieldSet.readString("name"), fieldSet.readString("date"));
        return customer;
    }

}
