import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int curr = 2;
        List<List<Integer>> res = new ArrayList<>(Arrays.asList(Arrays.asList(1)));
        if(numRows == 1)
            return res;
        res.add(Arrays.asList(1,1));
        if(numRows == 2)
            return res;
        while(curr < numRows){
            List<Integer> last = res.get(curr-1);
            int d = 0;
            List<Integer> cycle = new ArrayList<>();
            cycle.add(1);
            while(d<(curr-1)){
                cycle.add(last.get(d)+last.get(d+1));
                d ++;
            }
            cycle.add(1);
            res.add(cycle);
            curr++;
        }
        return res;
    }
}