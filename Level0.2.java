class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numExchange==0)return numBottles;
        int available=numBottles;
        int total=numBottles;
        while(available>=numExchange){
        int e=available/numExchange;
        int remaining=available%numExchange;
        total+=e;
        available=e+remaining;
        }


        return total;

    }
}
