class Solution {
    public String convertToTitle(int columnNumber) {
        // //version: 1
        // int last = 0;
        // String res = "";
        // while(columnNumber > 0){
        //     // System.out.println(columnNumber);
        //     int d = columnNumber % 26;
        //     last = (d==0)?26:d;
        //     // System.out.println(last);
        //     columnNumber -= last;
        //     columnNumber /= 26;
        //     res = (char)('A'+last-1) + res;
        //     // System.out.println(res+"\n");
        // }

        // System.out.println(columnNumber);
        // return res;

        //version: 2
        int last = 0;
        StringBuilder res = new StringBuilder();
        while(columnNumber > 0){
            // System.out.println(columnNumber);
            int d = columnNumber % 26;
            last = (d==0)?26:d;
            // System.out.println(last);
            columnNumber -= last;
            columnNumber /= 26;
            res.insert(0,(char)('A'+last-1));
            // System.out.println(res+"\n");
        }
        return res.toString();
    }
}