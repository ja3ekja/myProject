package com.epam.app;

import com.epam.app.beans.SimpleBean;
import com.epam.app.configurations.BeanConfiguration;
import com.epam.app.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
        simpleBean.doSomething();
        CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
        System.out.println(customerRepository.getCustomerName(34L));
    }
}