//time: O(N)
//space: O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        int j =0;
        for(int i = 0; i<nums.length; i++){
            if(val != nums[i]){
                nums[j] = nums[i];
                // System.out.println("in: "+j+" : "+i);
                // System.out.println(Arrays.toString(nums));
                j++;
            }
                // System.out.println("out: "+j+" : "+i);
        }
        return j;
    }
}