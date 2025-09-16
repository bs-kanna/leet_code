//time: O(N^2 ∗ Log m)
//space: O(N)
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> res = IntStream.of(nums).boxed().collect(Collectors.toList());
        for (int i = 0, j = 1; j < res.size(); i++, j++) {
            int gcd;
            boolean flag = false;
            gcd = gcd(res.get(i), res.get(j));

            // System.out.println(res.get(i) + ", " + res.get(j) + ", " + gcd);
            if (gcd > 1) {
                flag = true;
                // System.out.println(((long)res.get(i) * (long)res.get(j)) / gcd);
                res.set(i, ((int) (((long) res.get(i) * (long) res.get(j)) / gcd)));
                res.remove(j);
            }
            // System.out.println("1. "+i + ", " + j + ", " + flag);
            if (flag && (j < res.size())) {
                i -= (i > 1) ? 2 : 1;
                j -= (j > 2) ? 2 : 1;
                // System.out.println("2. "+i + ", " + j + ", " + flag);
            } else if (j >= (res.size() - 1) && isFound(res)) {
                // System.out.println("3. "+i + ", " + j);
                // System.out.println("in");
                i = -1;
                j = 0;
                // }else if(j>(res.size()-5)){
                //     System.out.println("4. "+i + ", " + j);
            }
            // System.out.println(res + "\n");

        }

        // System.out.println(res.size());
        // isFound(res);
        return res;
    }

    boolean isFound(List<Integer> res) {
        // System.out.print("isFound(res): ");
        for (int i = 0, j = 1; j < res.size(); i++, j++)
            if ((gcd(res.get(i), res.get(j))) > 1) {
                return true;
            }
        return false;
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, (a % b)); 
    }
}