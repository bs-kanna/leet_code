import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int i = 0;
        if((s.length() & 1) == 1)
            return false;
        Stack<Character> open = new Stack<>();
        while(i < s.length()){
            if("([{".contains(String.valueOf(s.charAt(i)))){
                open.push(s.charAt(i));
                // System.out.println("push: "+s.charAt(i));
                i++;
            }else if(")]}".contains(String.valueOf(s.charAt(i)))){
                if(open.isEmpty()){
                    return false;
                }
                char top = open.peek();
                if(((top == '(') && (s.charAt(i) == ')')) ||
                    ((top == '[') && (s.charAt(i) == ']')) ||
                    ((top == '{') && (s.charAt(i) == '}'))){
                        open.pop();
                        // System.out.println("pop: "+open.pop()+" --> close: "+s.charAt(i));
                        i++;
                }else{
                    return false;
                }
            }
        }
        if(!open.isEmpty())
            return false;
        return true;
    }
}