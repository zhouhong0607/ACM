package leetcode322;

import java.util.Arrays;

public class Solution
{
	// public int coinChange(int[] coins, int amount)
	// {
	// Arrays.sort(coins);
	// return coinChange(coins, 0,amount);
	// }
	//
	// public int coinChange(int[]coins,int location,int amount)
	// {
	// if(amount==0) return 0;
	// if(location>=coins.length) return -1;
	//
	// int n=amount/coins[location];
	// int count=Integer.MAX_VALUE;
	// for(int i=0;i<=n;i++)
	// {
	// int nextCount=coinChange(coins, location+1, amount-i*coins[location]);
	// int countI=nextCount!=-1?nextCount+i:-1;
	// if(countI>0&&countI<count)
	// count=countI;
	// }
	// if(count<Integer.MAX_VALUE)
	// return count;
	// else
	// return -1;
	// }

	public int coinChange(int[] coins, int amount)
	{
		if (amount < 1)
			return 0;
		return helper(coins, amount, new int[amount]);
	}

	private int helper(int[] coins, int rem, int[] count)
	{ // rem: remaining coins after the last step; count[rem]: minimum number of
		// coins to sum up to rem
		if (rem < 0)
			return -1; // not valid
		if (rem == 0)
			return 0; // completed
		if (count[rem - 1] != 0)
			return count[rem - 1]; // already computed, so reuse
		int min = Integer.MAX_VALUE;
		for (int coin : coins)
		{
			int res = helper(coins, rem - coin, count);
			if (res >= 0 && res < min - 1)
				min = 1 + res;
		}
		count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
		return count[rem - 1];
	}

//	public int coinChange(int[] coins, int amount)
//	{
//		if (amount < 1)
//			return 0;
//		int[] dp = new int[amount + 1];
//		int sum = 0;
//
//		while (++sum <= amount)
//		{
//			int min = -1;
//			for (int coin : coins)
//			{
//				if (sum >= coin && dp[sum - coin] != -1)
//				{
//					int temp = dp[sum - coin] + 1;
//					min = min < 0 ? temp : (temp < min ? temp : min);
//				}
//			}
//			dp[sum] = min;
//		}
//		return dp[amount];
//	}

	public static void main(String[] args) throws Exception
	{
		int[] coins = { 186, 419, 83, 408 };
		// int[] coins={1,2};
		Solution solution = new Solution();
		System.out.println(solution.coinChange(coins, 6249));

	}
}
