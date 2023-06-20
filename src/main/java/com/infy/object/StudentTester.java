package com.infy.object;

public class StudentTester {
    public static void main(String[] args) {
        StudentRegistration str1 = new StudentRegistration("Parks",24,2004);
        StudentRegistration str2 = new StudentRegistration("Parks",24,2006);
        if(str1.equals(str2))
        System.out.println("Roll Number already generated for the student");
        else
            str2.generateRollNumber();
        System.out.println("Student Details");
        System.out.println("********************************");
        System.out.println("Student Name     :"+str2.getStudentName());
        System.out.println("Admission Number    :"+str2.getAdmissionNumber());
        System.out.println("Roll Number   :"+str2.getRollNumber());
    }
}
