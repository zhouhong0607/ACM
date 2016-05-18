package leetcode198;

public class Solution
{
	public int rob(int[] nums)
	{
		int n = nums.length;
		if (nums == null || n == 0)
			return 0;
		if (n == 1)
			return nums[0];

		nums[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++)
		{
			nums[i] = Math.max(nums[i - 2] + nums[i], nums[i - 1]);
		}
		return nums[n - 1];
	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		int[] nums = { 2, 1, 1, 2 };
		solution.rob(nums);
	}
}
