package org.example.dao.custom;

import org.example.dao.CrudDAO;
import org.example.entity.Customer;

import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<Customer> {
    boolean search(Customer customer);

    ArrayList<Customer> getAll();
}
