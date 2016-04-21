package leetcode220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Solution
{
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t)
	{

		if (k <= 0 || t < 0 || nums.length < 2)
			return false;

		TreeSet<Long> hashMap = new TreeSet<>();

		for (int i = 0; i < nums.length; i++)
		{
			if (i > k)
				hashMap.remove((long) nums[i - k - 1]);

			long low = (long) nums[i] - (long) Math.abs(t);
			long high = (long) nums[i] + (long) Math.abs(t)+1;
			if (!hashMap.subSet(low, high).isEmpty())
				return true;
			hashMap.add((long) nums[i]);
		}
		return false;

	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		int[] nums =
		{ -1, -1 };
		solution.containsNearbyAlmostDuplicate(nums, 1, 0);

	}
}
