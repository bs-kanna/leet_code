//121
class Solution {
    public int maxProfit(int[] prices) {
        // //version: 1
        // int max = 0;
        // // System.out.println(prices.length);
        // for(int c = 0; c<prices.length-1; c++){
        //     if(prices[c]<prices[c+1])
        //         for(int g = c+1; g<prices.length;g++){
        //             max = Math.max((prices[g]-prices[c]),max); 
        //         }
        // }
        // return max;

        //     //version: 2
        //     return res(prices, prices.length-1);
        // }
        // int res (int[] arr,int i){
        //     int max = 0, ret = 0, j = i-1;
        //     // System.out.println("in "+i);
        //     if(i<=0)
        //         return 0;
        //     else
        //         ret = res(arr,i-1);
        //     while(j>=0){
        //         max = Math.max((arr[i]-arr[j]),max);
        //         // System.out.println("j -> "+j+", "+max);
        //         j--;
        //     }
        //     // System.out.println("i -> "+i+", j -> "+j+" max: "+max+", ret: "+ret);
        //     return Math.max(max,ret);

        //version: 3
        int sell = 0, buy = prices[0];
        for (int y = 1; y < prices.length; y++) {
            buy = Math.min(buy, prices[y]);
            sell = Math.max(sell, (prices[y] - buy));
        }
        return sell;
    }
}