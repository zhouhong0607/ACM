package leetcode188;

import java.util.PriorityQueue;

public class Solution
{
	// public int maxProfit(int k, int[] prices)
	// {
	// if (k == 0 || prices.length <= 0)
	// return 0;
	//
	// int minPrice = prices[0];
	// int curMaxPrice = 0;
	// int count = 0;
	// boolean up = false;
	//
	// PriorityQueue<Integer> pQueue = new PriorityQueue<>();
	//
	// int maxP = 0;
	// int dValueSum = 0;
	// for (int i = 1; i < prices.length; i++)
	// {
	//
	// if (prices[i] > prices[i - 1])
	// {
	//
	// int dValue = prices[i] - prices[i - 1];
	// if (prices[i] - minPrice > curMaxPrice + dValue)
	// {
	// count = 1;
	// curMaxPrice = prices[i] - minPrice;
	// pQueue.clear();
	// pQueue.add(-curMaxPrice);
	// } else
	// {
	// if (up == false)
	// {
	// count++;
	// dValueSum += dValue;
	// } else
	// {
	// dValueSum += dValue;
	// }
	// if (i + 1 >= prices.length - 1 || prices[i + 1] - prices[i] < 0)
	// {
	// pQueue.add(-dValueSum);
	// dValueSum = 0;
	//
	// }
	//
	// if (count > k)
	// {
	// for (int j = k; j > 0; j--)
	// {
	// curMaxPrice = 0;
	// if (!pQueue.isEmpty())
	// curMaxPrice += -pQueue.peek();
	//
	// }
	// } else
	// {
	// curMaxPrice = curMaxPrice + dValue;
	// }
	//
	// }
	//
	// up = true;
	// } else
	// {
	// up = false;
	// if (prices[i] < minPrice)
	// {
	// minPrice = prices[i];
	// }
	// }
	// }
	//
	// System.out.print(curMaxPrice);
	// return curMaxPrice;
	//
	// // if (count <= k)
	// // {
	// // maxP = curMaxPrice;
	// // } else
	// // {
	// //
	// // for (int j = k; j > 0; j--)
	// // {
	// // if (!pQueue.isEmpty())
	// // maxP += -pQueue.poll();
	// // }
	// // }
	// // return maxP;
	// }

	public int maxProfit(int k, int[] prices)
	{
		if (k == 0)
			return 0;
		int len = prices.length;

		if (k >= len / 2)
		{
			int maxPro = 0;
			for (int i = 1; i < len; i++)
				if (prices[i] > prices[i - 1])
					maxPro += prices[i] - prices[i - 1];
			return maxPro;
		}

		int[] dp = new int[2 * k];
		for (int i = 0; i < k; i++)
		{
			dp[i * 2] = Integer.MIN_VALUE;
			dp[2 * i + 1] = 0;
		}

		for (int price : prices)
		{
			if (dp[0] < -price)
				dp[0] = -price;
			int sign = 1;

			for (int i = 1; i < 2 * k; i++)
			{
				int tmp = dp[i - 1] + sign * price;
				if (dp[i] < tmp)
					dp[i] = tmp;
				sign *= -1;
			}
		}

		return dp[2 * k - 1];
	}

	public static void main(String[] args) throws Exception
	{
		// {3,3,5,0,0,3,1,4};
		// {};
		// [ 1, 2, 4, 2, 5, 7, 2, 4, 9, 0]
		int[] prices =
		{ 6, 1, 3, 2, 4, 7 };
		Solution solution = new Solution();
		System.out.print(solution.maxProfit(2, prices));
		
	}

}
