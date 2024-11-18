package Array;
public class BuySell {
    public static int  BuySellStock(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(minPrice < prices[i]){
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(BuySellStock(prices));;
    }
}
