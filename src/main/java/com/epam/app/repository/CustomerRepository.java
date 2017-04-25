package com.epam.app.repository;

import com.epam.app.models.Customer;

/**
 * Created by jacek on 25.04.17.
 */
public interface CustomerRepository {
    Customer getCustomer(long id);
    String getCustomerName(long id);

}
