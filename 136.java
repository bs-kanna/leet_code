import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for(int i: nums){
            if(!sets.add(i))
                sets.remove(i);
        }
        return (int)sets.toArray()[0];
    }
}