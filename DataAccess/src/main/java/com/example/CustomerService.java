package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    @Autowired
    private Customer customer;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveCustomer() {

        jdbcTemplate.execute("DROP TABLE IF EXISTS customers");
        jdbcTemplate.execute("CREATE TABLE customers (\n" +
                "  customerId VARCHAR(20) NULL,\n" +
                "  name VARCHAR(45) NULL)");

        jdbcTemplate.execute("INSERT INTO customers(name, customerId) VALUES " +
                "(\"" + customer.getName() + "\",\"" + customer.getCustomerId() + "\");");

        jdbcTemplate.execute("INSERT INTO customers(name, customerId) VALUES " +
                "(\"" + customer.getName() + "\",\"" + customer.getCustomerId() + "\");");

        List<Customer> customers = jdbcTemplate.query("Select * from customers", new CustomerRowMapper());
        System.out.println("Data From customers table:");
        customers.forEach(cust -> System.out.println(cust));

    }
}
