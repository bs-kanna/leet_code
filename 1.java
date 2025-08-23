//time: O(Nlog N)
//space: O(N)

import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> old = Arrays.stream(nums).boxed().toList();
        Arrays.sort(nums);
        int negative = (nums[0] < 0 ) ? nums[0] : 0;
        int last_index = nums.length -1;
        int comparable = negative + nums[last_index];
        while(comparable > target){
            // System.out.println(comparable);
            last_index--;
            comparable = negative + nums[last_index];
        }
        // System.out.println(last_index);
        int start = 0;
        int end = last_index;
        int sum = 0;
        while(true){
            sum = nums[start] + nums[end];
            // System.out.println("s["+start+"] : "+nums[start]+", e["+end+"] : "+nums[end]+", sum: "+sum);
            if (sum > target)
                end--;
            else if(sum < target)
                start++;
            else if(sum == target){
                int s = old.indexOf(nums[start]);
                int e = old.indexOf(nums[end]);
                if(s == e){
                    int k = s+1;
                    while(true){
                        if((old.get(k)).intValue() == nums[end])
                            return new int[]{s,k};
                        else
                            k++;
                    }
                }
                return new int[]{s,e};
            }
        }
    }
}