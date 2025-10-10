class Solution {
    public int maximumEnergy(int[] energy, int k) {
        // //version: 1
        // int max = Integer.MIN_VALUE;
        // for(int g = 0;g<energy.length;g++){
        //     int local = 0;
        //     for(int d = g;d<energy.length;d+=k){
        //         local += energy[d];
        //         // System.out.println(g+", "+d);
        //     }
        //     // System.out.println("val-> "+max+", "+local+"\n");
        //     if (local > max) max = local;
        // }
        // return max;

        //verion: 2
        int max = Integer.MIN_VALUE;
        for(int d = energy.length-1;d>=0;d--){
            if(d-k >= 0) energy[d-k] += energy[d];
        }
        // System.out.println(Arrays.toString(energy));
        for(int s : energy){
            max = (max>s) ? max : s;
        }
        return max;
    }
}