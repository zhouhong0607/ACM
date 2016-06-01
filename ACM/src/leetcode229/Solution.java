package leetcode229;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	//随机数解法
//	public List<Integer> majorityElement(int[] nums)
//	{
//		List<Integer> output = new ArrayList<>();
//		for (int i = 0; i < 100; i += 1)
//		{
//			int count = 0;
//			int index = (int) (nums.length * Math.random());
//			for (int j = 0; j < nums.length; j += 1)
//				if (nums[index] == nums[j])
//					count += 1;
//			if (count > nums.length / 3 && !output.contains(nums[index]))
//				output.add(nums[index]);
//		}
//		return output;
//	}

	public List<Integer> majorityElement(int[] nums)
	{
		List<Integer> rst = new ArrayList<Integer>();
		if (nums == null)
		{
			return rst;
		}
		int n1 = 0, n2 = 0;
		int c1 = 0, c2 = 0;
		for (int i = 0; i < nums.length; ++i)
		{
			int n3 = nums[i];
			if (c1 > 0 && c2 > 0)
			{
				if (n3 != n1 && n3 != n2)
				{
					c1--;
					c2--;
				} else if (n3 == n1)
				{
					c1++;
				} else
				{
					c2++;
				}
			} else if (c1 > 0)
			{
				if (n3 == n1)
				{
					c1++;
				} else
				{
					n2 = n3;
					c2++;
				}
			} else if (c2 > 0)
			{
				if (n3 == n2)
				{
					c2++;
				} else
				{
					n1 = n3;
					c1++;
				}
			} else
			{
				n1 = n3;
				c1++;
			}
		}
		c1 = c2 = 0;
		for (int i = 0; i < nums.length; ++i)
		{ // n1, n2 are only candidates!!! need to count again!!!
			if (nums[i] == n1)
			{
				c1++;
			} else if (nums[i] == n2)
			{ // no worry if n1==n2 in some cases, because we only count once.
				c2++;
			}
		}
		if (c1 > nums.length / 3)
		{
			rst.add(n1);
		}
		if (c2 > nums.length / 3)
		{
			rst.add(n2);
		}
		return rst;
	}

}
