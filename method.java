//WAP to demonstrate the method.
import java.net.SocketPermission;
import java.net.SocketTimeoutException;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

class Demo{
public int add(int num1, int num2){
    return num1 + num2 ;
}
}
public class method {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        
        Demo obj = new Demo();
        int result=obj.add(num1,num2);
        System.out.println(result);
    }

}
