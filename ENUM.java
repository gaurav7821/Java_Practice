//WAP to demonstrate the enum.

enum Status{
    Runnig, Failed, Pending, Success;
}
public class ENUM {
    public static void main(String[] args) {
        
        Status[] obj = Status.values(); 

        for (Status s : obj){
            System.out.println(s + " : " + s.ordinal());
        }
    }    
}
