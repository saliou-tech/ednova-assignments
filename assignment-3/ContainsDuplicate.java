import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int num: nums){
            if(hash.containsKey(num)){
                return true;
            }
            hash.put(num,num);
        }
        return false;
    }
}
