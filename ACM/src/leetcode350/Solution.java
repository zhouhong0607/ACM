package leetcode350;

import java.util.Arrays;
import java.util.HashSet;

public class Solution
{
	public int[] intersect(int[] nums1, int[] nums2)
	{
		HashSet<Integer> set = new HashSet<>();
		int index1, index2;
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
		for (index1 = 0, index2 = 0; index1 < nums1.length && index2 < nums2.length;)
		{
			if (nums1[index1] == nums2[index2])
			{
				set.add(index1);
				index1++;
				index2++;
			} else if (nums1[index1] < nums2[index2])
			{
				index1++;
			} else
			{
				index2++;
			}

		}
		int[] result = new int[set.size()];
		int i = 0;
		for (Integer index : set)
		{
			result[i++] = nums1[index];
		}
		return result;
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2,1 };
		Solution solution = new Solution();
		solution.intersect(nums1, nums2);
	}
}
