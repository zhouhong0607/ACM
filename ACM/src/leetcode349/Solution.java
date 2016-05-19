package leetcode349;

import java.util.Arrays;
import java.util.HashSet;

public class Solution
{
	public int[] intersection(int[] nums1, int[] nums2)
	{
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums1.length;i++)
			if(!set.contains(nums1[i]))
				set.add(nums1[i]);
		HashSet<Integer> result=new HashSet<>();
		for(int j=0;j<nums2.length;j++)
		{
			if(set.contains(nums2[j]))
			{
				result.add(nums2[j]);
				set.remove(nums2[j]);
			}
		}
		int[] num=new int[result.size()];
		int k=0;
		for(int m:result)
			num[k++]=m;
		return num;
	}
}
