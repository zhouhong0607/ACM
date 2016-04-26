package leetcode16;

import java.util.Arrays;

public class Solution
{
	public int threeSumClosest(int[] nums, int target)
	{
		int minDif = Integer.MAX_VALUE;
		int result=0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++)
		{
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int start = i + 1, end = nums.length - 1; start < end;)
			{
				int sum = nums[i] + nums[start] + nums[end];
				if (Math.abs(sum - target) < minDif)
				{
					minDif=Math.abs(sum - target);
					result=sum;
				}
				if (sum > target)
					end--;
				else if (sum < target)
				{
					start++;
				} else
				{
					return result;
				}

			}
		}
		return result;
	}
	
	public static void main(String[] args)throws Exception
	{
		int[] nums={0,2,1,-3};
		Solution solution=new Solution();
		solution.threeSumClosest(nums, 3);
	}
}
