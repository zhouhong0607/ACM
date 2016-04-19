package leetcode219;

import java.util.HashMap;

public class Solution
{
	public boolean containsNearbyDuplicate(int[] nums, int k)
	{
		HashMap<Integer, Integer> hashMap=new HashMap<>();//第一个存 num[i] 第二个存i
		for(int i=0;i<nums.length;i++)
		{
			if(hashMap.containsKey(nums[i]))
			{
				if(Math.abs(hashMap.get(nums[i])-i)<=k)
				{
					return true;
				}else
				{
					hashMap.remove(nums[i]);
					hashMap.put(nums[i], i);
				}
			}else
			{
				hashMap.put(nums[i], i);
			}
		}
		return false;
	}
}
