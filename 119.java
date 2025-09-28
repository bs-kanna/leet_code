import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int curr = 2;
        if(rowIndex == 0)
            return Arrays.asList(1);
        if(rowIndex == 1)
            return Arrays.asList(1,1);
        List<Integer> last = new ArrayList<>(Arrays.asList(1,1));
        while(curr <= rowIndex){
            int d = 0;
            List<Integer> cycle = new ArrayList<>();
            cycle.add(1);
            while(d<(curr-1)){
                cycle.add(last.get(d)+last.get(d+1));
                d ++;
            }
            cycle.add(1);
            last = cycle;
            curr++;
        }
        return last;
    }
}