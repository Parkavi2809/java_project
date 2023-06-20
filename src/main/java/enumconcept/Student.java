package enumconcept;

public class Student {

    enum Grade
    {
        A,B,C,D,E;
    }
    int studentId;
    String name;
    Grade grade;
    int scholarShipAmount;
    int totalMarks;

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public int getStudentId()
    {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getScholarShipAmount() {
        return scholarShipAmount;
    }

    public void setScholarShipAmount(int scholarShipAmount) {
        this.scholarShipAmount = scholarShipAmount;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void calculateGrade()
    {
        if(totalMarks>=250)
            grade=Grade.A;
        else if(totalMarks>=200 && totalMarks<250)
            grade=Grade.B;
        else if(totalMarks>=175 && totalMarks<200)
            grade =Grade.C;
        else if (totalMarks>=150 && totalMarks<175)
            grade=Grade.D;
        else
            grade=Grade.E;
    }
    public void calculateScholarshipAmount()
    {
        switch (grade)
        {
            case A:
                scholarShipAmount = 5000;
                break;
            case B:
                scholarShipAmount = 4000;
                break;
            case C:
                scholarShipAmount = 3000;
                break;
            case D:
                scholarShipAmount = 2000;
                break;
            case E:
                scholarShipAmount = 1000;
                break;
            default:
                scholarShipAmount = 0;
        }
    }
}

