class Solution {
    public int maxArea(int[] height) {
        // //version: 1
        // int local = 0;
        // for(int i = 0; i<height.length; i++){
        //     for(int j = 0;j<i;j++){
        //         int a = height[i]<height[j] ? height[i] : height[j];
        //         int area = a * (i-j);
        //         local = Math.max(local,area);
        //     }
            
        // }
        // return local;

        //version: 2
        int area = 0;
        for(int i=0,j=height.length-1;i<j;){
            int small = (height[i]<height[j]) ? height[i] : height[j];
            int temp = (j-i)*small;
            area = (temp > area) ? temp : area;
            // System.out.println("i: "+height[i]+", j: "+height[j]+", a: "+area);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return area;
    }
}