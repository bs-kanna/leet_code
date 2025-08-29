class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        int hlen = haystack.length();
        for(int i = 0; i<=(hlen-len); i++){
            // System.out.println(haystack.substring(i,(i+len))+" "+i);
            if(haystack.substring(i,(i+len)).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}