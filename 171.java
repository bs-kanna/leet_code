class Solution {
    public int titleToNumber(String columnTitle) {
        // //version: 1
        // StringBuilder s = new StringBuilder(columnTitle);
        // int num = 0;
        // int r = 0;
        // int l = s.length()-1;
        // while(r<=l){
        //     char c = s.charAt(l-r);
        //     // System.out.println("c: "+c+", l: "+l+", r: "+r);
        //     num += (((int) c- (int)'A')+1) * (Math.pow(26,r));
        //     r ++;
        // }
        // return num;

        //version: 2
        int val = 0;
        for(int i = 0;i<columnTitle.length();i++){
            val = (val*26) + (columnTitle.charAt(i)-'A'+1);
        }
        return val;
    }
}