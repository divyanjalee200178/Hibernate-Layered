package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CustomerDAO extends CrudDAO<Customer> {
    boolean search(Customer customer);

    List<Customer> getAll();
}
