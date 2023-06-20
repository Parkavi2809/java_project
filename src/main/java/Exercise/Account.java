package Exercise;

public class Account {
    public static void main(String[] args){
        Object[] o = new Object[3];//Line 1
        o[0] = "12";//Line 2
        int i =(int) o[0]; //Line 3
        System.out.print(i);

    }
}
