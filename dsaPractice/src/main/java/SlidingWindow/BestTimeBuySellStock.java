package SlidingWindow;

public class BestTimeBuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		int n = prices.length;
        int i=0,j=0,mp=0;
        while(j<n){
            if(prices[j]-prices[i] <0){
                i=j;
                j++;
            } else if(prices[j]-prices[i] >=0){
                mp=Math.max(mp,prices[j]-prices[i]);
                j++;
            }
        }
        return mp;
    }

}
