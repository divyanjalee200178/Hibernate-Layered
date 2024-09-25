package org.example.dao.custom.impl;

import org.example.dao.custom.OrderDAO;
import org.example.entity.Order;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public boolean save(Order object) {
        return false;
    }

    @Override
    public boolean update(Order object) {
        return false;
    }

    @Override
    public boolean delete(Order object) {
        return false;
    }
}
