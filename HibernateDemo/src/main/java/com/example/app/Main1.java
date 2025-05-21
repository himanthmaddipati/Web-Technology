package com.example.app;

import com.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        cfg.addAnnotatedClass(Student.class);
        SessionFactory factory = cfg.buildSessionFactory();

        // --- CREATE ---
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Student student = new Student("Bhavani", "bhavani@mail.com");
        session.save(student);
        tx.commit();
        session.close();
        System.out.println("✅ Student inserted.");

        int studentId = student.getId(); // Store generated ID for future operations

        // --- READ ---
        session = factory.openSession();
        Student fetchedStudent = session.get(Student.class, studentId);
        session.close();
        if (fetchedStudent != null) {
            System.out.println("🔍 Read Student: " + fetchedStudent);
        } else {
            System.out.println("❌ Student not found.");
        }

        // --- UPDATE ---
        session = factory.openSession();
        tx = session.beginTransaction();
        Student updateStudent = session.get(Student.class, studentId);
        if (updateStudent != null) {
            updateStudent.setName("Bhavani Bakka");
            updateStudent.setEmail("bakkabhavani@mail.com");
            session.update(updateStudent);
            tx.commit();
            System.out.println("✏️ Student updated.");
        } else {
            System.out.println("❌ Student not found for update.");
            tx.rollback();
        }
        session.close();

        // --- DELETE ---
        session = factory.openSession();
        tx = session.beginTransaction();
        Student deleteStudent = session.get(Student.class, studentId);
        if (deleteStudent != null) {
            session.delete(deleteStudent);
            tx.commit();
            System.out.println("🗑️ Student deleted.");
        } else {
            System.out.println("❌ Student not found for deletion.");
            tx.rollback();
        }
        session.close();

        factory.close();
    }
}
