//WAP to demonstrate the enum keyword usin if and else condition.
import java.util.*;

enum Status{
    Running, Failed, Pending, Success;
}
public class ENUM2 {
    public static void main(String[] args) {
        
       // Scanner s = new Scanner(System.in);
        Status obj = Status.Failed;
        // System.out.println("Enter the Status");
        // String ch = s.nextLine();

        if (obj == Status.Running){
            System.out.println("All Good");
        }else if (obj == Status.Failed){
            System.out.println("Try again");
        }else if (obj == Status.Pending){
            System.out.println("Please wait");
        }else{
            System.out.println("Done");
        }

    }
}
