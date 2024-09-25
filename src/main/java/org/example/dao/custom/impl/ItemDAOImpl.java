package org.example.dao.custom.impl;

import org.example.confi.FactoryConfiguration;
import org.example.dao.CrudDAO;
import org.example.dao.custom.ItemDAO;
import org.example.entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean save(Item object) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Item object) {
        return false;
    }

    @Override
    public boolean delete(Item object) {
        return false;
    }
}
