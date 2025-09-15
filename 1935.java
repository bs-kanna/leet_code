class Solution {
    
    public int canBeTypedWords(String text, String brokenLetters) {
        if(brokenLetters.equals(""))
            return text.split(" ").length;
        int count = 0;
        String [] textArr = text.split(" ");
        for(String word : textArr){
            boolean match = true;
            int i = 0;
            while(match && i<brokenLetters.length()){
                match = !word.contains(brokenLetters.charAt(i)+"");
                i++;
            }
            count = match ? (count+1) : count;
        }
        return count;
    }
}