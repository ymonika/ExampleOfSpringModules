package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"classpath:application-context.xml"});

        Customer customer = (Customer) appContext.getBean("customer");
        System.out.println("Customer name: " +customer.getName() + "    Setter Injection using setName() method");
        System.out.println("Customer Id: " +customer.getCustomerId() + "     Constructor Injection");

        CustomerService customerService = (CustomerService) appContext.getBean("customerService");
        customerService.saveCustomer();
    }
}
