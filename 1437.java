class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last = -k-1;
        for(int g = 0; g < nums.length; g++){
            if(nums[g] > 0 ){
                if( g - last <= k) return false;
                last = g;
            }
        }
        return true;
    }
}