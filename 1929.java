class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int len = nums.length;
        for (int c = 0; c < len; c++) {
            res[c] = nums[c];
            res[c + len] = nums[c];
        }
        return res;
    }
}