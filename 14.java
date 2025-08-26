//time: O(S)
//space: O(1)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int pl = 0;
        int len = strs[0].length();
        while(pl < len){
            boolean isPresent = false;
            String prefix = (strs[0]).substring(0,(pl+1));
            // System.out.println(strs[0].substring(0,(pl+1)));
            for(int i = 0; i < strs.length; i++){
                isPresent = strs[i].startsWith(prefix);
                if(!isPresent)
                    break;
                // System.out.println(isPresent);
            }
            if(isPresent){
                pl++;
                // System.out.println(pl);
            }else{
                // System.out.println(strs[0].substring(0,pl));
                return strs[0].substring(0,pl);
            }
        }
        return strs[0];
    }
}