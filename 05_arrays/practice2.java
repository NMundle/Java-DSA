public class practice2 {
    public static int maxProfit(int prices[]){

        if(prices.length == 0){
            return 0; // If the prices array is empty, no profit can be made
        }
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit  = 0;
        for(int currPrice = 0 ; currPrice < prices.length;  currPrice++){
            if( currPrice < buyPrice){
                buyPrice = currPrice; // Update buy price if current price is lower
            }else{
                int profit = currPrice - buyPrice; // Calculate profit if selling at current price
                maxProfit = Math.max(maxProfit, profit); // Update maximum profit if current profit is greater
                // than the previous maximum profit
            }
        }
           
        return maxProfit;
         

    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

        
    }
}