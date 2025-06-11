abstract class Car{
    public String getType(){return "Car";}
    abstract public void drive();
}

class WagonR extends Car{
    public void drive(){
        System.out.println("W");
    }

    public String getType(){
        return "WagonR";
    }
}

public class ABS {
    public static void main(String[] args) {
        Car c1 = new WagonR();
        System.out.println(c1.getType());
    }   
}
