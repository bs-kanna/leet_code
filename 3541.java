//time: O(N)
//space: O(1)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFreqSum(String s) {
        Map <Character,Integer> frequency = new HashMap<>();
        int vowel = 0, consonant = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int now = 1;
            if(frequency.containsKey(c)){
                now = frequency.get(c)+1;
                frequency.put(c,now);
            }else
                frequency.put(c,1);
            if("aeiou".contains(c+""))
                vowel = Math.max(vowel,now);
            else
                consonant = Math.max(consonant,now);
        }
        return vowel + consonant;
    }
}