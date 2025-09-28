//3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lenOfSub = 0;
        // int index = 0;
        int start = 0;
        int end = 0 ;
        while(end < s.length()){
            String subString ="";
            end = start;
            while(end<s.length() && !subString.contains(String.valueOf(s.charAt(end)))){
                subString += s.charAt(end);
                // System.out.println(subString);
                end++;
            }
            lenOfSub = (end - start) > lenOfSub ?  (end - start) : lenOfSub;
            start++;
        }
        return lenOfSub;
    }
}
