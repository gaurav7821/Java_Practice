import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{

    int age;
    String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age= "+ age + " , name= "+ name + " ]";
    }

    public int compareTo(Students that){
        if(this.age < that.age)
            return 1;
        else
            return -1;
    }
}

public class TorVsAble {
    public static void main(String[] args) {
        
        Comparator<Students> com = ( i, j) -> {return i.age > j.age?1:-1; };

        List<Students> studs = new ArrayList<Students>();

        studs.add(new Students(24, "Gaurav"));
        studs.add(new Students(33, "Bhushan"));
        studs.add(new Students(28,"Pranav"));
        studs.add(new Students(12, "Mohit"));
        studs.add(new Students(21, "Nikhil"));

        Collections.sort(studs, com);

        for(Students s : studs){
            System.out.println(s);
        }
    }
}
