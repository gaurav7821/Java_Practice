import java.util.HashMap;
import java.util.Map;

public class HASHMAP {
    public static void main(String[] args) {
        
        Map<String, Integer> Students = new HashMap<>();

        Students.put("Bhushan", 100);
        Students.put("Mohit", 50);
        Students.put("Pranav", 50);
        Students.put("Gaurav",80);

        System.out.println(Students);
        System.out.println(Students.get("Gaurav"));  //for get value
        System.out.println(Students.keySet());           //for get only keyset
        System.out.println(Students.values());           //for get only value
        
        for(String Stud :  Students.keySet()){
            System.out.println(Stud + " : " + Students.get(Stud));
        }

    }
}
