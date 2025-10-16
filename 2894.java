//2894
//time: O(N)
//space: O(1)
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for(int k =1;k<=n;k++){
            if((k%m)==0)
                num1 += k;
            else
                num2 += k;
        }
        return num2-num1;
    }
}