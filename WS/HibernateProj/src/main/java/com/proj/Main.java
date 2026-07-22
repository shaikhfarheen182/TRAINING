package com.proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static  void main(String[] args){
    //insert value  or update
    Student s1 = new Student();
    s1.setName("ANKIT");
    s1.setRollno(7);
    s1.setAge(24);




            //WITHOUT OPTIMIZATION
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.proj.Student.class);
//        cfg.configure();

        //CODE OPTIMIZATION
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.proj.Student.class)
                .configure()
                .buildSessionFactory();

//        SessionFactory  sf  = cfg.buildSessionFactory();
        Session  session = sf.openSession();
        //fetch
//        s1 = session.get(Student.class,7);
        //fetch data
//        Student s2 = session.get(Student.class ,1);


        //insert value
        Transaction transaction = session.beginTransaction();

        //INSERT
//        session.persist(s1);

        //update
        session.merge(s1);


        // DELETE
//        session.remove(s1);

        //insert value
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
            //print fetched data
//        System.out.println(s2);
    }
}
