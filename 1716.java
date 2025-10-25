class Solution {
    public int totalMoney(int n) {
        int full = n/7;
        // System.out.println("full - "+full);
        int val = (full>0) ? (int)((28*full) + ((7*full*(full-1))/2)) : 0;
        // System.out.println("val - "+val); 
        int rem = n-(full*7);
        full = (full>0) ? full+1 : 1;
        // System.out.println("rem - "+rem); 
        // System.out.println("("+(2*full)+" + "+(rem-1)+") * "+rem*0.5f); 
        // System.out.println("("+((2*full)+(rem-1))+") * "+rem*0.5f); 
        // System.out.println(((2*full)+(rem-1)) * (rem*0.5f)); 
        return val + (int)(((2*full)+(rem-1))*rem*0.5f);
    }
}