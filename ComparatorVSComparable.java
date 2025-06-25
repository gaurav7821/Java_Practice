import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVSComparable {
    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a%10 > b%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(89);
        nums.add(21);
        nums.add(97);

        Collections.sort(nums, com);     //for sorting a array list
        System.out.println(nums);
    }
}