package org.example.bo.custom.impl;

import org.example.bo.custom.CustomerBO;
import org.example.dao.custom.CustomerDAO;
import org.example.dao.custom.impl.CustomerDAOImpl;
import org.example.dto.CustomerDTO;
import org.example.entity.Customer;

import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO=new CustomerDAOImpl();

    public boolean save(CustomerDTO customerDTO){
        return  customerDAO.save(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getTel(),customerDTO.getEmail()));
    }
    public boolean update(CustomerDTO customerDTO){
        return  customerDAO.update(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getTel(),customerDTO.getEmail()));
    }
    public boolean delete(CustomerDTO customerDTO){
        return customerDAO.delete(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getTel(),customerDTO.getEmail()));
    }

    public boolean search(CustomerDTO customerDTO){
        return customerDAO.delete(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getTel(),customerDTO.getEmail()));
    }

    public ArrayList<CustomerDTO> getAllCustomers() {
        ArrayList<CustomerDTO> allCustomers= new ArrayList<>();
        ArrayList<Customer> all = customerDAO.getAll();
        for (Customer c : all) {
            allCustomers.add(new CustomerDTO(c.getId(),c.getName(),c.getAddress(),c.getTel(),c.getEmail()));
        }
        return allCustomers;
    }
}
