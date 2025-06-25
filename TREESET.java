import java.util.Set;
import java.util.TreeSet;

public class TREESET {
    public static void main(String[] args) {
        
        Set<Integer> obj = new TreeSet<Integer>();
        
        obj.add(44);
        obj.add(23);
        obj.add(66);
        obj.add(10);

        for(int n :  obj){
            System.out.println(n);
        }
    }
}
