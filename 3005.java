//time: O(N)
//spade: O(1)

class Solution {
    public int maxFrequencyElements(int[] nums) {
        // //version: 1
        // int max = 0, l = 0;
        // Map<Integer,Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // while(l<nums.length){
        //     // map.compute(nums[l], (i,c) -> (c == null) ? 1 : c+1);
        //     map.put(nums[l], map.getOrDefault(nums[l],0)+1);
        //     if(max == map.get(nums[l])){
        //         list.add(max);
        //     }
        //     else if(max < map.get(nums[l])){
        //         max = map.get(nums[l]);
        //         list = new ArrayList<>();
        //         list.add(max);
        //     }
        //     l++;
        // }
        // return list.size()*max;

        //version: 2
        int maxFre = 0, count = 0;
        int arr[] = new int[101];
        for (int z : nums) {
            arr[z] += 1;
            if (maxFre == arr[z]) {
                count += 1;
            } else if (maxFre < arr[z]) {
                count = 1;
                maxFre = arr[z];
            }
        }
        return maxFre * count;
    }
}