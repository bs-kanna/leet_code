//time: O(N)
//space: O(N)

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set <Integer> unique = new HashSet<>();
        int count = 0;
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(unique.add(nums[i])){
                // System.out.println(nums[i]);
                nums[j++] = nums[i];
                count++;
            }
        }
        return count;
    }
}