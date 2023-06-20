package Exercise;

import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        int marks1[] = new int[]{60,70,80,90,89};
        int marks2[] = new int[]{80,90,78,90,89};
        Student stud = new Student(123,"Aarthi",marks1);
        Student stud1 = new Student(125,"Krish",marks2);
        System.out.println("Average Mark of Student1 :"+stud.calculateAverage());
        System.out.println("Average Mark of Student2  :"+stud1.calculateAverage());
        System.out.println("Grade :"+stud.calculateGrade());
    }
}
