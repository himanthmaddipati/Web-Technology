package com.example.app;

import com.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.model.Student.class);
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = new Student("Himanth", "himanth@mail.com");
        session.save(s);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("Student inserted and table should be created.");
    }
}
