package com.klu.model;

public class CourseRegistration {

    private int rollNo;
    private String studentName;
    private String courseName;
    private int semester;

    // Constructor Injection
    public CourseRegistration(int rollNo, String studentName,
                              String courseName, int semester) {
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
