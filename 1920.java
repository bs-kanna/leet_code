class Solution {
    public int[] buildArray(int[] nums) {
        int [] res = new int [nums.length];
        for (int v =0;v<nums.length;v++)
            res[v] = nums[nums[v]];
        return res;
    }
}