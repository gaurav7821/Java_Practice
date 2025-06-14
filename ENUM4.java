//ENUM class

import java.nio.channels.Pipe.SourceChannel;

enum Laptop{
    MacBook(100000), Hp(80000), Dell(50000), Asus(60000), Lenovo(40000);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}

public class ENUM4 {
    public static void main(String[] args) {
        
        // Laptop obj = Laptop.MacBook;
        // System.out.println(obj + " : " + obj.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " +  lap.getPrice());
        }
    }
}