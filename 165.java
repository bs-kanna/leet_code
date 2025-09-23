class Solution {
    public int compareVersion(String version1, String version2) {
        //version: 1
        int original = 1;
        String [] s1 = version2.split("\\.");
        String [] s2 = version1.split("\\.");
        if(s2.length < s1.length){
            String [] temp = s1;
            s1 = s2;
            s2 = temp;
            temp=null;
            original = -1;
        }
        int g = 0;
        while(g<s1.length){
            if(Integer.parseInt(s1[g])>Integer.parseInt(s2[g])) return -1*original;
            if(Integer.parseInt(s1[g])<Integer.parseInt(s2[g])) return 1*original;
            g++;
        }
        while(g<s2.length){
            if(Integer.parseInt(s2[g])>0) return 1*original;
            g++;
        }
        return 0;
    }
}