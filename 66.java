//time: O(N)
//space: O(1)
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int las = digits.length -1;
        digits[las] += 1;
        if(digits[las] < 10){
            // System.out.println("1");
            return digits;
        }else{
            while(digits[las] > 9 && las > 0){
                digits[las] = 0;
                // System.out.println(las+" "+ digits[las]);
                digits[--las] += 1;
            }
                // System.out.println(las);
            if(las == 0 && digits[0] > 9){
                // System.out.println(las);
                digits = Arrays.copyOf(digits, digits.length+1);
                digits[digits.length -1] = 0;
                digits[0] = 1;
            }
            // System.out.println("2");
            return digits;
        }
        // return new int[0];
    }
}