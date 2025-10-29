class Solution {
    public int smallestNumber(int n) {
        int setBite = 1;
        while(setBite < n) setBite = setBite * 2 + 1;
        return setBite;
    }
}