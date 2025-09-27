import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ree = new ArrayList<>();
        for(int g = 0; g < words.length;g++){
            // if(words[g].contains(x+"")) ree.add(g);
            if(words[g].indexOf(x)!=-1) ree.add(g);
        }
        return ree;
    }
}