package leetcode283;

public class Solution
{
	public void moveZeroes(int[] nums)
	{
		if(nums==null) return;
		int i=0,j=nums.length-1;
		while(i<j)
		{
			 if(nums[i]==0)
			 {
				 for(int k=i;k<=j-1;k++)
				 {
					 nums[k]=nums[k+1];
				 }
				 nums[j--]=0;
			 }else
			 {
				 i++;
			 }
		}
	}
	
	
}
