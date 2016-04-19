package leetcode220;

public class Solution
{
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t)
	{
		for(int i=0;i<nums.length-k;i++)
		{
			for(int j=i+1;j<k+1;j++)
			{
				int dif=Math.abs(nums[i]-nums[j]);
				if(dif<=t) return true;
			}
			
		}
		return false;
	}
}
