package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"classpath:application-context.xml"});

        CustomerService customerService = (CustomerService) appContext.getBean("customerServiceProxy");
        customerService.printName();
        customerService.printURL();
        try {
            customerService.printThrowException();
        } catch (Exception e) {

        }

    }
}
