class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        char last = '0'-1;
        int max = 0;
        for(int k = 0; k<neededTime.length; k++){
            if(last == colors.charAt(k)) {
                time += Math.min(max, neededTime[k]);
                // System.out.println("if "+max+", "+ neededTime[k]+"    - "+time);
                max = Math.max(neededTime[k], max);
            }else{
                max = neededTime[k];
                last = colors.charAt(k);
                // System.out.println("else "+last+"    - "+max);
            }
        }
        return time;
    }
}