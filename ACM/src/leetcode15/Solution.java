package leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

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
			
			
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			

			Integer[] every = new Integer[3];
			every[0] = nums[i];
			int sum = nums[i];
			for (int j = i + 1; j <= nums.length - 2; j++)
			{
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;

				sum += nums[j];
				if (sum > 0)
					break;
				every[1] = nums[j];

				for (int k = j + 1; k < nums.length; k++)
				{
					if (k > j + 1 && nums[k] == nums[k - 1])
						continue;
					sum += nums[k];
					every[2] = nums[k];
					if (sum == 0)
					{
						List<Integer> line = new ArrayList<>();
						for (int n = 0; n < 3; n++)
							line.add(every[n]);
						result.add(line);
					}
					sum -= nums[k];
				}
				sum -= nums[j];
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
