package org.example.dao.custom.impl;

import org.example.confi.FactoryConfiguration;
import org.example.dao.CrudDAO;
import org.example.dao.custom.ItemDAO;
import org.example.entity.Customer;
import org.example.entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

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

    public List<Item> getAll()  {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Query query=session.createQuery("from Item");
        List<Item> list=query.list();

        transaction.commit();
        session.close();

        return list;
    }
}
