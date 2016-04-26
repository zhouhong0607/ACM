package leetcode18;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import leetcode43.Solution;

public class leetcode18
{
	public List<List<Integer>> fourSum(int[] nums, int target)
	{
		List<List<Integer>> result = new LinkedList<>();
		if (nums == null || nums.length < 4)
			return result;
		int i = 0;
		Arrays.sort(nums);
		while (i < nums.length - 3)
		{		
			int j = i + 1;
			while (j < nums.length - 2)
			{
				int start = j + 1, end = nums.length - 1;
				while (start < end)
				{
					int sum=nums[i]+nums[j]+nums[start]+nums[end];
					if(sum==target)
					{
						result.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
						do
						{
							start++;
						} while (start<end&&nums[start]==nums[start-1]);
						do
						{
							end--;
						} while (start<end&&nums[end]==nums[end+1]);
					}else if(sum<target)
					{
							start++;
					}else
					{
							end--;
					}
				}
				do
				{
					j++;
				} while (j<nums.length-2&&nums[j] == nums[j - 1]);
			}
			do
			{
				i++;
			} while (i<nums.length-3&&nums[i] == nums[i - 1]);
		}
		return result;
	}
	public static void main(String[] args)throws Exception
	{
		int[] nums={1,-2,-5,-4,-3,3,3,5,-11};
		leetcode18 leetcode18=new leetcode18();
		leetcode18.fourSum(nums, -11);
	}
}
