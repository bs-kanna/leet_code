import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int i =0;
        int sum =0;
        Map<String,Integer> value = new HashMap<>();
        value.put("I",1);
        value.put("IV",4);
        value.put("V",5);
        value.put("IX",9);
        value.put("X",10);
        value.put("XL",40);
        value.put("L",50);
        value.put("C",100);
        value.put("XC",90);
        value.put("D",500);
        value.put("CD",400);
        value.put("CM",900);
        value.put("M",1000);
        int len = s.length()-1;
        while(i < len){
            // System.out.println(String.valueOf(s.charAt(i))+", "+value.get(String.valueOf(s.charAt(i))));
            if(value.containsKey(s.substring(i,(i+2)))){
                // System.out.println(s.substring(i,(i+2))+", "+i);
                sum += value.get(s.substring(i,(i+2)));
                i += 2;
            }else  if(value.containsKey(s.substring(i,(i+1)))){
                // System.out.println(s.substring(i,(i+1))+", "+i);
                sum += value.get(String.valueOf(s.charAt(i)));
                i++;
            }
            // System.out.println((i));            
        }
        if((i == len) || (len == 0)){
            // System.out.println(s.substring(i));
            sum += value.get(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}