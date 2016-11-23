package leetcode453;

public class Solution
{
	public int minMoves(int[] nums)
	{
		if(nums==null||nums.length<1) return 0;
		int min=nums[0],res=0;
		for( int i:nums)
			min=Math.min(min, i);
		for(int j:nums)
			res+=j-min;
		return res;
	}
}
