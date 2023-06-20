package interfaceexercise;

public class Trainee implements DataProvider{
    int marksSecured;

    public Trainee(int marksSecured)
    {
        this.marksSecured= marksSecured;
    }
    public void calcPercentage()
    {
        double percentage = ((double) marksSecured/(double) totalMaximumMarks)*100;
        System.out.println("the total aggregate percentage secured is "+percentage);
    }
}
