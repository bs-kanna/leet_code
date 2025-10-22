class Solution {
    public boolean isStrictlyPalindromic(int n) {
        // return false;
        StringBuilder s = new StringBuilder();
        int q = 2;
        while(q < n-1){
            int f = n;
            while(f>0){
                s.append(f%q);
                // System.out.println(f+", "+s);
                f /= q;
                // System.out.println(s+" -> "+s.reverse());
                String d = s.toString();
                if(! (d.equals(s.reverse().toString()))) return false;
            }
            q++;
            // System.out.println(q+"\n");
            s.setLength(0);
        }
        return true;
    }
}