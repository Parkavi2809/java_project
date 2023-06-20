package interfaceexercise;

public class StudentPercentageCalculator {
    public static void main(String[] args) {
        DataProvider dp = null;
        dp=new Intern(5000,500);
        dp.calcPercentage();
        dp=new Trainee(6000);
        dp.calcPercentage();
        dp = new Intern(8000,500);
        dp.calcPercentage();
        dp =new Trainee(8000);
        dp.calcPercentage();

    }

}
