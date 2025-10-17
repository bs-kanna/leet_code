class Solution {
    public int climbStairs(int n) {
        int count = 0;
        for(int ones = n, twos = 0; twos <= n/2; twos++, ones -= 2){
            int a, b;
            if(ones>twos) {a = ones; b = twos;}
            else {a = twos; b = ones;}
            count += fact((a+b),a,b);
            // System.out.println(count+"\n");
        }
        return count;
    }
    // //version: 1
    // private int fact(int k, int q, int f){
    //     // System.out.println("k - "+ k+", q - "+q+", f - "+f);

    //     if(k==0) return 1;
    //     long res = 1;
    //     while(k>q || f>1) {
    //         if(k>q) res *= k--;
    //         if(res % f == 0){
    //             // System.out.print(res+" / "+f+" = ");
    //             res /= f--;
    //         }
    //         // System.out.println(res);
    //     }
    //     return (int)res;
    // }

    //version: 2
    private int fact(int k, int q, int f){
        // System.out.println("k - "+ k+", q - "+q+", f - "+f);

        if(k==0) return 1;
        int n=1;
        long res = 1;
        while(k>q || n<f) {
            if(k>q) res *= k--;
            if(res % n == 0){
                // System.out.print(res+" / "+n+" = ");
                res /= n++;
            }
            // System.out.println(res);
        }
        return (int)res;
    }
}