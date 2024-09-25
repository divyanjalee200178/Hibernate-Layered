package org.example.bo.custom;

import org.example.dto.CustomerDTO;
import org.example.dto.ItemDTO;

public interface ItemBO {
    public boolean save(ItemDTO itemDTO);
    public boolean update(ItemDTO itemDTO);
    public boolean delete(ItemDTO itemDTO);
    public boolean search(ItemDTO itemDTO);
}
