package leetcode152;

public class Solution
{
	// public int maxProduct(int[] nums)
	// {
	// if(nums==null||nums.length<1) return 0;
	// int positie=nums[0],negative=nums[0],max=nums[0];
	// for(int i=1;i<nums.length;i++)
	// {
	// max=Math.max(max ,Math.max(positie*nums[i],negative*nums[i]));
	// int pre=positie;
	// positie=Math.max(nums[i], Math.max(positie*nums[i], negative*nums[i]));
	// negative=Math.min(nums[i], Math.min(pre*nums[i], negative*nums[i]));
	// }
	// return max;
	// }

	public int maxProduct(int[] nums)
	{
		int min;
		int res = nums[0], max = min = nums[0]; // max, min means max and min
												// product among the subarrays
												// whose last element is A[i].
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] > 0)
			{
				max = Math.max(max * nums[i], nums[i]);
				min = Math.min(min * nums[i], nums[i]);
			} else
			{
				int lastMax = max;
				max = Math.max(min * nums[i], nums[i]);
				min = Math.min(lastMax * nums[i], nums[i]);
			}
			res = Math.max(res, max);
		}
		return res;
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums = { -4, -3, -2 };
		Solution solution = new Solution();
		System.out.println(solution.maxProduct(nums));
	}
}
