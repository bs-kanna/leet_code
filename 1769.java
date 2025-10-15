//time: O(N)
//space: O(N)
class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int []arr = new int [len];
        int balls = 0, returns = boxes.charAt(0) - '0'; 
        for(int j = len-1;j>0; j--){
            // arr[j] = boxes.charAt(j) - '0';
            // arr[j] = (boxes.charAt(j)=='0')? -1:j;
            if (boxes.charAt(j) == '1') balls++;
            arr[j-1] += (arr[j]+balls);
        }
        // System.out.println(Arrays.toString(arr));
        for(int j = 0;j<len-1;j++){
            // System.out.println(j+"-> b: "+balls+", r: "+returns);
            arr[j+1] = (arr[j]-balls+returns);
            if (boxes.charAt(j+1) == '1') {balls--; returns++;}
            // System.out.println(Arrays.toString(arr)+"\n");
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}