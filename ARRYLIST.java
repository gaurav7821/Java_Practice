import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ARRYLIST {

    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("5");

        System.out.println(nums.indexOf(5));
        System.out.println(((ArrayList<Integer>)nums).get(3));

        // for( Object n : nums){
        //     int num = (Integer)n;
        //     System.out.println(num*2);
        // }
        
    }
    
}
