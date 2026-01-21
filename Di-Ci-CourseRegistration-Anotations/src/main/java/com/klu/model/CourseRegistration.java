package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration {

    private int rollNo;
    private String studentName;
    private String courseName;
    private int semester;

    public CourseRegistration(
            @Value("101") int rollNo,
            @Value("Neelima") String studentName,
            @Value("FSAD") String courseName,
            @Value("5") int semester) {

        this.rollNo = rollNo;
        this.studentName = studentName;
        this.courseName = courseName;
        this.semester = semester;
    }

    public void display() {
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course Name : " + courseName);
        System.out.println("Semester    : " + semester);
    }
}
