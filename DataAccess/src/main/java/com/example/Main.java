package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"classpath:application-context.xml"});

        System.out.println("saveCustomer() method is going to save customers onto mysql database, where database schema name *test*");

        CustomerService customerService = (CustomerService) appContext.getBean("customerService");
        customerService.saveCustomer();


    }
}
