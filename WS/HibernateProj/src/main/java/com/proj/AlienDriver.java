package com.proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import java.util.Arrays;
import java.util.List;

public class AlienDriver {

    public static void main(String[] args) {

//        Laptop l4 = new Laptop();
//        l4.setLap_id(4);
//        l4.setBrand("ASUS");
//        l4.setModel("asus");
//        l4.setRam(32);
//
//        Laptop l1 = new Laptop();
//        l1.setLap_id(1);
//        l1.setBrand("ASUS");
//        l1.setModel("RYZEN");
//        l1.setRam(16);
//
//        Laptop l2 = new Laptop();
//        l2.setLap_id(2);
//        l2.setBrand("HP");
//        l2.setModel("I5");
//        l2.setRam(32);
//
//        Laptop l3 = new Laptop();
//        l3.setLap_id(3);
//        l3.setBrand("APPLE");
//        l3.setModel("MACBOOK AIR");
//        l3.setRam(32);
//                                                          //many to many
//        Aliens a1 = new Aliens();
//        a1.setAid(1);
//        a1.setAname("ZAKIR");
//        a1.setTechnology("FULLSTACK");
//
//        Aliens a2 = new Aliens();
//        a2.setAid(2);
//        a2.setAname("ARYA");
//        a2.setTechnology("CYBERSECURITY");



//
//        a1.setLaptops(Arrays.asList(l1,l2));
//        a2.setLaptops(Arrays.asList(l3));

//        a1.setLaptops(Arrays.asList(l1,l2,l3));
//        a2.setLaptops(Arrays.asList(l1,l2));//many to many
//        a3.setLaptops(Arrays.asList(l1,l3));

//        a1.setLaptops(Arrays.asList(l1,l2)); //one to many

//        l1.setAliens(Arrays.asList(a1,a2));
//        l2.setAliens(Arrays.asList(a1,a2));//many to  many
//        l3.setAliens(Arrays.asList(a1,a3));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Aliens.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

       Laptop l1 = session.get(Laptop.class,2);
        System.out.println(l1);
        session.close();


        Session session1 = sf.openSession();

        Laptop l2 = session.get(Laptop.class,2);
        System.out.println(l2);
        session1.close();
//        Transaction transaction = session.beginTransaction();

//        Query query = session.createQuery("from Laptop ");
//        List<Laptop> laptop = query.getResultList();

//        String brand = "ASUS";
//        List<String> laptops = session
//                .createQuery("select brand from Laptop where lower(brand) =lower(?1)", String.class)
//                .setParameter(1,brand)
//                .getResultList();
//        System.out.println(laptops);  //FETCHING DATA

//        Laptop l1 = session.get(Laptop.class,32);

//        System.out.println(l1);

//        session.persist(l4);//to create record


//        session.persist(a1);   // FIRST parent  FOR MANY TO ONE
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);          // MANY TO MANY

//        session.persist(a1);
//        session.persist(a2);
//



//        transaction.commit();

        session.close();

//        Session session1 = sf.openSession();
//        Aliens a5 = session.get(Aliens.class,2);//by default lazy fetching because fetching whole data might be costly
//
//        session1.close();
             sf.close();
    }
}