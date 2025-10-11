//1034
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        while(n>=2){
            res[n-1] =  n;
            res[n-2] =  -n;
            n-=2;
        }
        if(n==1)
            res[0] = 0;
        return res;

    }
}