class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // //version: 1
        // int s = 0;
        // for(String str : operations){
        //     if(str.equals("X++") || str.equals("++X")) s++;
        //     else if(str.equals("X--") || str.equals("--X")) s--;
        // }
        // return s;

        //version: 2
        int d = 0;
        for(String h : operations){
            if (h.contains("+")) d++;
            else d--;
        }
        return d;
    }
}