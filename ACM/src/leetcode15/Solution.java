package leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import javax.sound.sampled.Line;

public class Solution
{
	public List<List<Integer>> threeSum(int[] nums)
	{
		List<List<Integer>> result = new LinkedList<>();
		if (nums == null || nums.length < 3)
			return result;
		Arrays.sort(nums);
		for (int i = 0; i <= nums.length - 3; i++)
		{
			if(nums[i]>0) break;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j <= nums.length - 2; j++)
			{
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				if(nums[i]+nums[j]>0)
					break;
				for (int k = j + 1; k < nums.length; k++)
				{
					if (k > j + 1 && nums[k] == nums[k - 1])
						continue;
					if(nums[i]+nums[j]+nums[k]==0)
					{
//						List<Integer> oneLine=new LinkedList<>();
//						oneLine.add(nums[i]);
//						oneLine.add(nums[j]);
//						oneLine.add(nums[k]);
						result.add(Arrays.asList(nums[i],nums[j],nums[k]));
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums =
		{ 0, 0, 0 };
		Solution solution = new Solution();
		solution.threeSum(nums);
	
	}
}
