class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int d : nums){
            if(d % 3 > 0)
                ans++;
        }
        return ans;
    }
}