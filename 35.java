//time: O(logN)
//space: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int i=0, k=len-1;
        if(nums[0] >= target){
            return 0;
        }else if(nums[len-1] == target){
            return len-1;
        }else if(nums[len-1] < target){
            return len;
        }
        int g=0;
        while(i<=k && g < 50){
            System.out.println("i: "+i+" k: "+k);
            int j = nums[(i+k)/2];
            System.out.println(nums[i]+" - "+j+" - "+nums[k]);
            if(j == target){
                return (i+k)/2;
            }else if(i+1 == k && (((nums[i]+1) == target) || ((nums[k]-1) == target))){
                return k;
            }else if(j < target){
                i = ((i+k)/2);
            }else if(j > target){
                k = ((i+k)/2);
            }
            g++;
        }

        return 105;
    }
}