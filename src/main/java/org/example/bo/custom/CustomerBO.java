package org.example.bo.custom;

import org.example.dto.CustomerDTO;
import org.example.entity.Customer;

import java.util.List;

public interface CustomerBO {
    public boolean save(CustomerDTO customerDTO);
    public boolean update(CustomerDTO customerDTO);
    public boolean delete(CustomerDTO customerDTO);
    public boolean search(CustomerDTO customerDTO);
    public List<CustomerDTO> getAllCustomers();
}
