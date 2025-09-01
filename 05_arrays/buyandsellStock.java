public class buyandsellStock {
    public static int maxProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE; // Initialize buy price to maximum value
        int maxProfit = 0; // Initialize maximum profit to zero
        for(int i =0; i< prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; // Calculate profit if selling at current price
                maxProfit = Math.max(maxProfit, profit); // Update maximum profit if current profit is
                // greater than the previous maximum profit
               
            } else{
                buyPrice = prices[i]; // Update buy price if current price is lower

            } 
        }  
        return maxProfit; // Return the maximum profit found}
    }

public static void main(String[] args) {
    int prices[] ={7,1,5,3,6,4}; // Example prices array
    System.out.println(maxProfit(prices)); // Call the function and print the result
    
}

}