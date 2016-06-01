package leetcode169;

import java.util.Arrays;

public class Solution
{
	// public int majorityElement(int[] nums)
	// {
	// Arrays.sort(nums);
	// int count=1;
	// for(int i=1;i<nums.length;i++)
	// {
	// if(nums[i]==nums[i-1])
	// {
	// count++;
	// if(count>nums.length/2)
	// return nums[i];
	// }
	// else
	// {
	// count=1;
	// }
	// }
	// return nums[0];
	// }

	public int majorityElement(int[] nums)
	{
		int count = 1;
		int major = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] != major)
			{
				count--;
			} else
			{
				count++;
				if(count>nums.length/2)
					return major;
			}
			if (count == 0)
			{
				major = nums[i];
				count = 1;
			}
		}
		return major;
	}

}
