//time: O(Max(A,B))
//space: O(Max(A,B))

class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int carryOver = 0, i=0;
        if(a.length() > b.length()){
            b = "0".repeat(a.length() - b.length()) + b;
        }else{
            a = "0".repeat(b.length() - a.length()) + a;
        }
        int len = a.length()-1;
        while(i<=len){
            int sum = Integer.valueOf(a.charAt(len-i)+"")
                        + Integer.valueOf(b.charAt(len-i)+"") 
                        + carryOver;
            carryOver = 0;
            // System.out.println(sum);
            if(sum == 0){
                res = 0+res;
            }else if(sum == 1){
                res = 1+res;
            }else if(sum == 2){
                res = 0+res;
                carryOver = 1;
            }else if(sum == 3){
                res = 1+res;
                carryOver = 1;
            }
            i++;
        }
        if(carryOver == 1){
            res = 1+res;
        }
        return res;
    }
}
