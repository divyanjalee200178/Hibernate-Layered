package org.example.dao.custom.impl;

import org.example.confi.FactoryConfiguration;
import org.example.dao.custom.CustomerDAO;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    public boolean save(Customer object) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
        return true;
    }
    public boolean update(Customer object){
        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
        return true;
    }
    public boolean delete(Customer object){
        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
        return true;
    }

//    public boolean search(Customer customer){
//        Session session=FactoryConfiguration.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        //session.se(customer);
//        transaction.commit();
//        session.close();
//        return true;
//    }

    @Override
    public boolean search(Customer customer) {
        return false;
    }

    public ArrayList<Customer> getAll()  {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Query query=session.createQuery("from Customer");
        List<Customer> list=query.list();

        transaction.commit();
        session.close();

        return list;
    }


}
