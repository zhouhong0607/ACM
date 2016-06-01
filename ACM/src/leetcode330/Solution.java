package leetcode330;

public class Solution
{
	public int minPatches(int[] nums, int n)
	{
		int cnt;
		int patches = 0;
		long nextToMaxSum = 1;

		for (cnt = 0; cnt < nums.length && nextToMaxSum - 1 < n;)
		{
			if (nextToMaxSum < nums[cnt])
			{
				nextToMaxSum = nextToMaxSum << 1;
				patches++;
			} else
			{
				nextToMaxSum += nums[cnt++];
			}
		}

		while (nextToMaxSum - 1 < n)
		{
			nextToMaxSum = nextToMaxSum << 1;
			patches++;
		}

		return patches;
	}
	
	public static void main(String[] args)throws Exception
	{
		int[] nums={1,3};
		Solution solution=new Solution();
		solution.minPatches(nums, 6);
	}
}
