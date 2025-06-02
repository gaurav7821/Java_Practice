//WAP to demonstrate a constractor.

class Demo{

    int age;
    String name;

    public Demo(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Demo(){
        System.out.println("Constructor Called");
    }

    public void show(){
        System.out.print(age + " : " + name);
    }
}

public class Const {
    public static void main(String[] args) {
        
        Demo obj1 = new Demo();
        Demo obj = new Demo(22,"Gogos");
        obj.show();
    }
}
