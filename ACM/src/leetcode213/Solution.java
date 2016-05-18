package leetcode213;

public class Solution
{
	public int rob(int[] nums)
	{
		int n=nums.length;
		if(nums==null||n==0) return 0;
		if(n==1) return nums[0];
		if(n==2) return Math.max(nums[0], nums[1]);
		if(n==3) return Math.max(Math.max(nums[0], nums[1]), nums[2]);
		
		int[] rob1=new int[n-1];
		int[] rob2=new int[n-1];
		
		rob1[0]=nums[0];
		rob1[1]=Math.max(nums[0], nums[1]);
		rob2[0]=nums[1];
		rob2[1]=Math.max(nums[1], nums[2]);
		for(int i=2;i<n-1;i++)
		{
			rob1[i]=Math.max(rob1[i-2]+nums[i], rob1[i-1]);
			rob2[i]=Math.max(rob2[i-2]+nums[i+1], rob2[i-1]);
		}
		
		return Math.max(rob1[n-2], rob2[n-2]);
	}
}
