//Threads 

import java.util.concurrent.TransferQueue;

class A extends Thread{
    public void run(){
        for(int i=0 ; i<=10 ; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
class B extends Thread {
    public void run(){
         for(int i=0 ; i<=10 ; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
public class THREAD {
    public static void main(String[] args) {
        A obj = new A();
        B objB = new B();

        obj.start();
        
        objB.start();
        
    }
}
