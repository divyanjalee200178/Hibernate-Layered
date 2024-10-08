package org.example.bo.custom.impl;

import org.example.bo.custom.ItemBO;
import org.example.dao.custom.CustomerDAO;
import org.example.dao.custom.ItemDAO;
import org.example.dao.custom.impl.CustomerDAOImpl;
import org.example.dao.custom.impl.ItemDAOImpl;
import org.example.dto.CustomerDTO;
import org.example.dto.ItemDTO;
import org.example.entity.Customer;
import org.example.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemBOImpl implements ItemBO {
    ItemDAO itemDAO=new ItemDAOImpl();


    public boolean save(ItemDTO itemDTO){
        return  itemDAO.save(new Item(itemDTO.getCode(),itemDTO.getName(),itemDTO.getQty(),itemDTO.getUnitPrice()));
    }
    public boolean update(ItemDTO itemDTO){
        return  itemDAO.update(new Item(itemDTO.getCode(),itemDTO.getName(),itemDTO.getQty(),itemDTO.getUnitPrice()));
    }
    public boolean delete(ItemDTO itemDTO){
        return itemDAO.delete(new Item(itemDTO.getCode(),itemDTO.getName(),itemDTO.getQty(),itemDTO.getUnitPrice()));
    }

    public boolean search(ItemDTO itemDTO){
        return itemDAO.delete(new Item(itemDTO.getCode(),itemDTO.getName(),itemDTO.getQty(),itemDTO.getUnitPrice()));
    }
    public List<ItemDTO> getAllItems() {
        List<Item> all = itemDAO.getAll();
        List<ItemDTO> allCustomers= new ArrayList<>();
        for (Item i : all) {
            ItemDTO itemDTO=new ItemDTO(i.getCode(),i.getName(),i.getQty(),i.getUnitPrice());
            allCustomers.add(itemDTO);
        }
        return allCustomers;
    }
}
