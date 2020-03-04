
public class Problem121 {

	public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, profit = 0;
        for(int i=0;i<prices.length;i++) {
        	if(prices[i] < minPrice)
        		minPrice = prices[i];
        	else if(prices[i] - minPrice > profit)
        		profit = prices[i] - minPrice;
        }
		return profit;
    }
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
}
