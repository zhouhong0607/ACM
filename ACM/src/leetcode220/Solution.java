package leetcode220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t)
	{

		if (k <= 0 || t < 0)
			return false;
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++)
		{
			List<Integer> keyDelete=new LinkedList<>();
			for (Integer key : hashMap.keySet())
			{
				
				if (i - hashMap.get(key) <= k)
				{
					if (Math.abs(key - nums[i]) <= t)
					{
						return true;
					}else
					{
						keyDelete.add(key);
					}
						
				}else
				{
					keyDelete.add(key);
				}

			}
			for(Integer key:keyDelete)
			{
				hashMap.remove(key);
			}
			
			if (!hashMap.containsKey(nums[i]))
			{
				hashMap.put(nums[i], i);
			} else
			{
				hashMap.replace(nums[i], i);
			}

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
