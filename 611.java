import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        // //versin: 1
        // int count = 0;        int third = 2, first = 0, second = 1;
        // int firstdVal = nums[first];
        // Set<String> set= new HashSet<>();
        // // System.out.println(Arrays.toString(nums));
        // int len = nums.length - 1;
        // System.out.println(len);
        // while(first<(len-1)){
        //     // System.out.println(first+", "+second+", "+third);
        //     int i = nums[first];
        //     int j = nums[second];
        //     int k = nums[third];

        //     if(set.contains(i + "." + j + "." + k)) count++;
        //     else if((k + j > i) && (i + j > k) && (i + k > j)) {
        //         // System.out.println("in "+nums[first]+", "+nums[second]+", "+nums[third]);
        //         set.add(i+"."+j+"."+k);
        //         count++;  
        //     }
        //     if(third==len){
        //         if(second == len-1){
        //             first++;
        //             second = first + 1;
        //             third = second + 1;
        //         }else{
        //             second++;
        //             third = second + 1;
        //         }
        //     }else
        //         third++;
        // }
        // return count;

        //version: 2
        int len = nums.length - 1;
        int f = len, count =0;
        // System.out.println(Arrays.toString(nums));
        while(f > 1){
            int v = 0,b = f-1;
            // System.out.println(f);
            while(v<b){
                // System.out.println(v+", "+b);
                if(nums[v]+nums[b]>nums[f]){
                    count += (b-v);
                    // System.out.println(count);
                    b--;
                }else
                    v++;
            }
            f--;
            // System.out.println("\n");
        }
        return count;
    }
}