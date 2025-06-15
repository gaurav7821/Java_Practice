//Lamda expression

interface A{

    int show(int a, int b);
        
    
}

public class LAMDA2 {
    public static void main(String[] args) {
        
        A obj = (a,b) -> a+b;
        int result = obj.show(10,30);

        System.out.println(result);
    }

    
}
