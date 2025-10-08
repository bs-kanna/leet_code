import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i = 0; i < spells.length;i++){
            double s = spells[i];
            double div = success / s;
            // System.out.println(div);   
            long target =(long) ((div % 1 == 0) ? (success / s) : (success / s)+1);
            int j;
            // System.out.println(target);   
            if (potions[0] >= target) j=0;
            else if (potions[potions.length-1] < target) j=potions.length;
            else j =  getIndex(potions,0,potions.length-1,target);
            // System.out.println(j);   
            spells[i] = potions.length-j;
        }
        return spells;
    }
    // //version: 1
    // private int getIndex(int [] portions,int left, int right, long target){
    //     int mid = (left+right) / 2;
    //     // System.out.println("left: "+left+", right: "+right+", mid: "+mid);
    //     // System.out.println(portions[mid]+", "+target); 
    //     if((left<=right) && (portions[left]<target) && (portions[left+1]>=target)){
    //         return left+1;
    //     }else if(left+1 == right) return portions.length;
    //     else if(portions[mid]<target){
    //         return(getIndex(portions,mid,right,target));
    //     }else if(portions[mid]>= target){
    //         return(getIndex(portions,left,mid,target));
    //     }
    //     else return -1;
    // }

    //version: 2
    private int getIndex(int [] portions,int left, int right, long target){
        // int limit = 0;
        // while(left<=right && limit<10){
        while(left<=right){
            int mid = (left+right) /2;
            // System.out.println(left+", "+mid+", "+right);
            if(portions[left]<target && portions[left+1]>=target){
                return left+1;
            }
            if(portions[mid]<target){
                left = mid;
            }else{
                right = mid;
            }
            // limit++;
        }
        return portions.length;
    }
}