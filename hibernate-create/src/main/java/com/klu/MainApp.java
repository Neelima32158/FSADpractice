package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class MainApp {

 public static void main(String[] args) {
  //Load Configuration and create a SessionFactory
  SessionFactory factory=new Configuration()
    .configure().buildSessionFactory();
  //Open session
  Session session = factory.openSession();
  //Begin Transaction
  Transaction tx=session.beginTransaction();
  //create the table/object
  Student s1=new Student("Neelima");
  Student s2=new Student("Ram");
  //Save the data/object
  session.save(s1);
  session.save(s2);  //commit
  tx.commit();
  //close the connection
  session.close();
  factory.close();
  System.out.println("Student data inserted Successfully");
 }
}