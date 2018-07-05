package com.example;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CustomerRowMapper implements RowMapper<Customer> {

    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer(rs.getString("customerId"), rs.getString("name"), rs.getString("date"));
        return customer;
    }

}