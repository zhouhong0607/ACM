package leetcode123;

import java.util.Arrays;

public class Solution
{
	 public int maxProfit(int[] prices) {
	        int[] buy=new int[2];
	        int[] sell=new int[2];
	        Arrays.fill(buy,Integer.MIN_VALUE);
	        for(int i=0;i<prices.length;i++)
	        {
	            int tmp=0;
	            for(int j=0;j<2;j++)
	            {
	                int tmp1=tmp-prices[i];
	                if(tmp1>buy[j])
	                buy[j]=tmp1;
	                
	                tmp1=buy[j]+prices[i];
	                if(tmp1>sell[j])
	                sell[j]=tmp1;
	                tmp=sell[j];
	            }
	            
	        }
	        return sell[1];
	        
	        
	    }
}
