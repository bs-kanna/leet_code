class Solution {
    public int[] getNoZeroIntegers(int n) {
        int [] res = {1,n-1};
        while((String.valueOf(res[0]).contains("0"))
            || (String.valueOf(res[1]).contains("0"))){
                res[0] +=1;
                res[1] -=1;
            // System.out.println(Arrays.toString(res));
        }
        return res;
    }
}