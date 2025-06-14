//WAP to demonstrate the enum keyword usin if and else condition.
import java.util.*;

enum Status{
    Running, Failed, Pending, Success;
}
public class ENUM3 {
    public static void main(String[] args) {
        
       // Scanner s = new Scanner(System.in);
        Status obj = Status.Success;
        // System.out.println("Enter the Status");
        // String ch = s.nextLine();

       switch (obj) {
        case Running: System.out.println("All Good");
        break;
       
        case Failed: System.out.println("Try Again");
        break;

        case Pending: System.out.println("Please Wait");
        break;

        default: System.out.println("Done");
        break;
       }

    }
}
