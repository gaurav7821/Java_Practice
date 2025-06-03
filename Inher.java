//WAP to demonstrate a inheritance.

class Calc{

    public int add(int a, int b){
        return a + b ;
    }
    public int sub(int a, int b){
        return a - b ;
    }
}

class AddCalc extends Calc{

    public int multi(int a, int b){
        return a * b ;
    }
    public double div(int a, int b){
        return a / b ;
    }
}

class VeryAddCalc extends AddCalc{

    public double power(int a, int b){
        return Math.pow(a, b);
    }
}


public class Inher {
    public static void main(String[] args) {
        
        VeryAddCalc obj = new VeryAddCalc();
        int r1 = obj.add(20,20);
        int r2 = obj.sub(50, 20);
        int r3 = obj.multi(5, 5);
        double r4 = obj.div(20, 5);
        double r5 = obj.power(10, 20);

        System.out.println(r1 + " " +r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
