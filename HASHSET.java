import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class HASHSET {

    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(62);
        nums.add(54);
        nums.add(83);
        nums.add(21);
        

        System.out.println(nums);

        for( int n : nums){
            System.out.println(n);
        }
        
    }
    
}
