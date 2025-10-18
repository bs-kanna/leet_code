class Solution {
    public int[] transformArray(int[] nums) {
        // //version: 1
        // int [] data = new int [nums.length];
        // int e = 0;
        // for(int f : nums) if((f&1)==0) e++;
        // int s;
        // for(s = 0; s<e; s++) data[s] = 0;
        // for(;s<nums.length; s++) data[s] = 1;
        // return data;

        //version: 2
        for(int f = 0, e = nums.length-1; f<=e;){
            // System.out.println(Arrays.toString(nums));
            if((nums[f]&1)==0) nums[f++] = 0;
            else{
                nums[f] = nums[e];
                nums[e--] = 1;
            }
        }
        return nums;
    }
}