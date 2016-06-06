package leetcode26;

public class Solution
{
	public int removeDuplicates(int[] nums)
	{
		if(nums==null||nums.length<2) return nums.length;
		int i,j;
		for( i=0,j=i+1;j<nums.length;)
		{
			if(nums[i]==nums[j])
			{
				j++;
				continue;
			}else
			{
				int c=nums[i+1];
				nums[i+1]=nums[j];
				nums[j]=c;
				i=i+1;
				j=j+1;
			}
		}
		return i+1;
	}
	
	
}
