class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        // //version: 1
        // int empty = 0;
        // int consumed = 0;
        // while(numBottles>0){
        //     System.out.println("numBottles: "+numBottles+ ", empty: "+empty+ ", consumed: "+consumed);
        //     numBottles --;
        //     empty ++;
        //     consumed ++;
        //     if(empty == numExchange){
        //         numBottles += 1;
        //         numExchange += 1;
        //         empty = 0;
        //         System.out.println("numBottles: "+numBottles+ ", empty: "+empty+ ", consumed: "+consumed+ ", numExchange: "+numExchange+"\n");
        //     }
        // }
        // System.out.println("--- numBottles: "+numBottles+ ", empty: "+empty+ ", consumed: "+consumed+ ", numExchange: "+numExchange );
        // return consumed;

        //version: 2
        int consumed = 0;
        while(numBottles>=numExchange){
            numBottles -= numExchange;
            numBottles++;
            consumed += numExchange++;
        // System.out.println("numBottles: "+numBottles+", consumed: "+consumed+ ", numExchange: "+numExchange );
        }
        // System.out.println("numBottles: "+numBottles+", consumed: "+consumed+ ", numExchange: "+numExchange );
        return consumed+numBottles;
    }
}