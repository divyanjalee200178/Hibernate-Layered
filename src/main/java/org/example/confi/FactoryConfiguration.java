package org.example.confi;

import org.example.entity.Customer;
import org.example.entity.Item;
import org.example.entity.Order;
import org.example.entity.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
   private static FactoryConfiguration factoryConfiguration;
   private SessionFactory sessionFactory;

   private FactoryConfiguration(){
       Configuration configuration=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Item.class).addAnnotatedClass(Order.class).addAnnotatedClass(OrderDetail.class);
       sessionFactory=configuration.buildSessionFactory();
   }

   public static FactoryConfiguration getInstance(){
       return factoryConfiguration==null? factoryConfiguration=new FactoryConfiguration(): factoryConfiguration;
   }

   public Session getSession(){
       return sessionFactory.openSession();
   }
}
