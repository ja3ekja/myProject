package com.epam.app.configurations;

import com.epam.app.aop.LoggingAspect;
import com.epam.app.beans.SimpleBean;
import com.epam.app.beans.impl.SimpleBeanImpl;
import com.epam.app.repository.CustomerRepository;
import com.epam.app.repository.impl.CustomerRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by jacek on 24.04.17.
 */
@Configuration
@EnableAspectJAutoProxy
public class BeanConfiguration {

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBeanImpl();
    }

    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepositoryImpl();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

}
