package leetcode309;

public class Solution
{
	public int maxProfit(int[] prices)
	{
		if(prices.length<2) return 0;
		
		int sell=0;
		int cool=0;
		for(int i=1;i<prices.length;i++)
		{
			int pro=prices[i]-prices[i-1];
			int ifSell=Math.max(sell+pro, cool);
			int ifCool=Math.max(sell, cool);
			sell=ifSell;
			cool=ifCool;
		}
		return Math.max(sell, cool);
	}
}
