package com.epam.app.repository.impl;

import com.epam.app.models.Customer;
import com.epam.app.repository.CustomerRepository;

/**
 * Created by jacek on 25.04.17.
 */
public class CustomerRepositoryImpl implements CustomerRepository {


    @Override
    public Customer getCustomer(long id) {
        return null;
    }


    public String getCustomerName(long id) {
        return "Jacek";
    }
}
