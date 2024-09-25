package org.example.bo.custom;

import org.example.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerBO {
    public boolean save(CustomerDTO customerDTO);
    public boolean update(CustomerDTO customerDTO);
    public boolean delete(CustomerDTO customerDTO);
    public boolean search(CustomerDTO customerDTO);
    public ArrayList<CustomerDTO> getAllCustomers();
}
