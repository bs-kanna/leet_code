class Solution {
    public boolean hasSameDigits(String s) {
        // //version: 1
        // StringBuilder old = new StringBuilder(s);
        // while(old.length() > 2){
        //     StringBuilder neu = new StringBuilder();
        //     for(int i = 1; i < old.length(); i++){
        //         int val = ((old.charAt(i)-'0') + (old.charAt(i-1)-'0'))%10;
        //         neu.append(val);
        //         // System.out.println("neu- "+neu);
        //     }
        //     old.setLength(0);
        //     old.append(neu.toString());
        //     // System.out.println("old- "+old);
        //     neu.setLength(0);
        // }
        // return old.charAt(0) == old.charAt(1);

        //version: 2
        while(s.length() > 2){
            StringBuilder neu = new StringBuilder();
            for(int i = 1; i < s.length(); i++){
                int val = ((s.charAt(i)-'0') + (s.charAt(i-1)-'0'))%10;
                neu.append(val);
                // System.out.println("neu- "+neu);
            }
            s = neu.toString();
            // System.out.println("s- "+s);
            neu.setLength(0);
        }
        return s.charAt(0) == s.charAt(1);
    }
}