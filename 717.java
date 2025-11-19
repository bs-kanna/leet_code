class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int h = 0;
        while(h < bits.length - 1){
            h += (bits[h] == 0) ? 1 : 2;
        }
        return h < bits.length;
    }
}