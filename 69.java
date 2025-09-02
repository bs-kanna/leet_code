//time: O(Sqrt(X))
//space: O(1)

class Solution {
    public int mySqrt(int x) {
        int next = 1, count = 0;
        while(x>=0){
            x -= next;
            next += 2;
            count ++;
        }
        return count-1;
    }
}