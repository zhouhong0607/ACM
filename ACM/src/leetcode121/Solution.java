package leetcode121;

public class Solution
{
	  public int maxProfit(int[] prices)
		{
			if(prices==null||prices.length<1) return 0;
			
			int lowPrice=prices[0];
			int interval=0;
			
			for(int i=1;i<prices.length;i++)
			{
			    int dif=prices[i]-lowPrice;
			    if(dif>interval)
			    interval=dif;
			    
			    if(prices[i]<lowPrice)
			    lowPrice=prices[i];
			}
			return interval;
		}
}
