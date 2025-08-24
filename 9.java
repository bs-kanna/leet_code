class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else if(x%10 == 0 && x < 10)
            return true;
        else if(x%10 == 0)
            return false;
        else{
            int rev = 0;
            while(x>rev){
                rev = (rev*10)+(x%10);
                x /= 10;
                // System.out.println(x+", "+rev);
            }
            return (x == rev) || (x == rev/10);
        }
    }
}