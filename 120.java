import java.util.List;

class Solution {
    int len;
    Integer [][] arr;
    public int minimumTotal(List<List<Integer>> triangle) {
        //     //version: 1
        //     return res(triangle,0,0);
        // }
        // int res(List<List<Integer>> triangle, int row, int col){
        //     if(row==triangle.size())
        //         return 0;
        //     int now = triangle.get(row).get(col);
        //     int l = res(triangle,row+1,col);
        //     int r = res(triangle,row+1,col+1);
        //     // System.out.println(l+", "+r);
        //     return (l<r) ? (l+now) :(r+now);

        // //version: 2
        // for (int k = (triangle.size() - 2); k >= 0; k--) {
        //     for (int g = 0; g < triangle.get(k).size(); g++) {
        //         triangle.get(k).set(g,
        //                 Math.min(triangle.get(k + 1).get(g), triangle.get(k + 1).get(g + 1)) + triangle.get(k).get(g));
        //     }
        // }
        // return triangle.get(0).get(0);
        
        //version: 3
        len = triangle.size();
        arr = new Integer[len][len];
        return res(triangle,0,0);
    }

    int res(List<List<Integer>> triangle, int row, int col){
        if(row==len)
            return 0;
        if(arr[row][col]!=null) return arr[row][col];
        int now = triangle.get(row).get(col);
        int l = res(triangle,row+1,col);
        int r = res(triangle,row+1,col+1);
        // System.out.println(l+", "+r);
        return arr[row][col] = (l<r) ? (l+now) :(r+now);
    }
}