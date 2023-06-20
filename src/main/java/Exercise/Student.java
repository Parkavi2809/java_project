package Exercise;

public class Student {
    public int studentId;
    public String name;
    public char Grade;
    public int marks[] = new int[5];

    public Student(int studentId, String name, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        //Grade = grade;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public char getGrade() {
//        return Grade;
//    }
//
//    public void setGrade(char grade) {
//        Grade = grade;
//    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0, count = 0;
        for (int i : marks) {
            sum += i;
            count++;
        }
        double average = sum / (double) count;
        return average;
    }
    public char calculateGrade() {
        if (calculateAverage()!=0) {
            if (calculateAverage() >= 90 && calculateAverage() <= 100)
                return 'A';
            else if (calculateAverage() >= 80 && calculateAverage() <= 89)
                return 'B';
            else if (calculateAverage() >= 70 && calculateAverage() <= 79)
                return 'C';
            else if (calculateAverage() >= 60 && calculateAverage() <= 69)
                return 'D';
        } else {
            return 'F';
        }
        return 0;
    }
    public int getRanking()
    {
        return 0;
    }
}

