class Solution {
    public int findFinalValue(int[] nums, int original) {
        int [] ref = new int[1001];
        for(int h = 0; h < nums.length; h++)
            ref[nums[h]] = 1;
        while(true){
            if(original < 1001 && ref[original] == 1)
                original *= 2;
            else 
                return original;
        }
    }
}