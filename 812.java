class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for(int f = 2;f<points.length;f++){
            for(int g = 1;g<f;g++){
                for(int v = 0;v<g;v++){
                    int[] p1 = points[f];
                    int[] p2 = points[g];
                    int[] p3 = points[v];
                    double temp = 0.5 * Math.abs(
                        (p1[0]*(p2[1]-p3[1]))
                        +(p2[0]*(p3[1]-p1[1]))
                        +(p3[0]*(p1[1]-p2[1])));
                    // if(temp>area){
                        area = Math.max(area,temp);
                        // System.out.println(f+", "+g+", "+v+", a: "+area);
                    // }
                }
            }
        }
        return area;
    }
}