//WAP to demonstrate the encapsulation.

class Demo{

    private String name;
    private int age;

    public void setAge(int a){
        age = a ;
    }
    public void setName(String n){
        name = n ;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // public void show(){
    //     System.out.println(name + " : " + age );
    // }

    public String toString(){
        return "name: " + name + " age: " + age;
    }

}
public class Encap {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.setAge(22);
        obj.setName("Gaurav");    
        // obj.show();


        System.out.println(obj);
    }
   
}
