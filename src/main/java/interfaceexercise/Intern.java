package interfaceexercise;

interface DataProvider
{
    int totalMaximumMarks = 8000;
    public void calcPercentage();
}

public class Intern implements DataProvider {
    int marksSecured;
    int graceMarks;

    public Intern(int marksSecured,int graceMarks)
    {
        this.marksSecured =marksSecured;
        this.graceMarks = graceMarks;
    }

    public int getGraceMarks() {
        return graceMarks;
    }
     public void calcPercentage()
    {
          double total = marksSecured + graceMarks;
          double percentage = (total/totalMaximumMarks)*100;
          if(total<=totalMaximumMarks) {
              System.out.println("the total aggregate percentage secured is " + percentage);
          }
          else {
              System.out.println("Please enter the correct marks");
          }
    }

}
