//Inner class
import java.util.*;

class A{

    public void show(){
        System.out.println("This is a A classs");
    }

    class B{
        int a, b;
        public int addNum(int a, int b){
            return a + b;
        }
    }
}
public class INNERCLSS {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        System.out.println(obj1.addNum(10,20));
    }
}
