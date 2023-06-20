package Exercise;

public class Bank {

        public void checkUsername(String name){

            String username="infosys";

            if(name.equals(username)){
                System.out.println("valid");
            }
            if(name==username){
                System.out.println("valid");
            }
            if(name.equals(new String("infosys"))){
                System.out.println("valid");
            }
            if(name==new String("infosys")){
                System.out.println("valid");
            }
        }

        public static void main(String[] args) {
            new Bank().checkUsername("infosys");//Line 1
        }

//public static void main(String[] args) {
//
//
//    String value1 = "Hello";
//    String value2 = new String("Hello");
//    System.out.print(value1 == value2);
//    System.out.print(" ");
//    String value3 = value2.intern();
//    System.out.println(value1 == value3);
//  }
}
