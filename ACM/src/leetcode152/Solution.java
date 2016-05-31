package leetcode152;

public class Solution
{
	public int maxProduct(int[] nums)
	{
		if(nums==null||nums.length<1) return 0;
		int[][] record=new int[nums.length][nums.length];
		for(int k=0;k<nums.length;k++)
			record[k][k]=nums[k];
		int maxProduct=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				record[j][i]=record[j][i-1]*nums[i];
				maxProduct=Math.max(record[j][i], maxProduct);
			}
		}
		return maxProduct;
	}
	public static void main(String[] args)throws Exception
	{
		int[] nums={2,3,-2,4};
		Solution solution=new Solution();
		System.out.println(solution.maxProduct(nums));	
	}
}
