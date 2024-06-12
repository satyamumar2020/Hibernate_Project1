package com.app.hib.satyam.hib;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hib.satyam.hib.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
       
        SessionFactory factory =cfg.buildSessionFactory();
        
       Session session= factory.openSession();
       Transaction txn= session.beginTransaction();
       Student stu=new Student();
       stu.setId(2);
       stu.setName("satyam");
       stu.setSalary(1234345.55);
       
       session.save(stu);
       txn.commit();
    }
}
