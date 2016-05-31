package leetcode300;

import java.util.Arrays;

public class Solution
{
	// public int lengthOfLIS(int[] nums)
	// {
	// if(nums==null||nums.length<=1) return nums.length;
	// int[] record=new int[nums.length];
	// Arrays.fill(record, 1);
	// for(int i=1;i<nums.length;i++)
	// {
	// for(int j=0;j<i;j++)
	// {
	// if(nums[j]<nums[i]&&record[j]+1>record[i])
	// record[i]=record[j]+1;
	// }
	// }
	// int l=0;
	// for(int k=0;k<record.length;k++)
	// l=Math.max(l, record[k]);
	// return l;
	// }

	public int lengthOfLIS(int[] nums)
	{
		int N = 0, idx, x;
		for (int i = 0; i < nums.length; i++)
		{
			x = nums[i];
			if (N < 1 || x > nums[N - 1])
			{
				nums[N++] = x;
			} else if ((idx = Arrays.binarySearch(nums, 0, N, x)) < 0)
			{
				nums[-(idx + 1)] = x;
			}
		}
		return N;
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums = { 10, 9, 2, 5, 3, 7, 101,6,7};
//		System.out.println(Arrays.binarySearch(nums, 0,nums.length,2));
		Solution solution = new Solution();
		System.out.println(solution.lengthOfLIS(nums));
	}
}
