package com.infy.object;

public class StudentRegistration {
    public String studentName;
    public double age;
    public int admissionNumber;
    public int rollNumber;
    static int counter = 1001;

    public StudentRegistration(String studentName, double age, int admissionNumber) {
        this.studentName = studentName;
        this.age = age;
        this.admissionNumber = admissionNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAge() {
        return age;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int hashCode()
    {
        return admissionNumber;
    }
    public boolean equals(Object ob)
    {
        StudentRegistration stud = (StudentRegistration)ob;
        if(this.hashCode()==stud.hashCode())
        {
            return this.studentName.equals(stud.studentName);
        }
        return false;
    }
    public void generateRollNumber()
    {
        rollNumber = counter +1;
    }
}
