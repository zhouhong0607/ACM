package leetcode448;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<Integer> findDisappearedNumbers(int[] nums)
	{
		List<Integer> results=new ArrayList<>();
		int i=0;
		while(i<nums.length)
		{
			if(i+1==nums[i]||nums[i]==nums[nums[i]-1])
			{
				i++;
			}
			else if(nums[i]!=nums[nums[i]-1])
			{
				int c=nums[i];
				nums[i]=nums[nums[i]-1];
				nums[c-1]=c;
			}
		}
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]!=j+1)
				results.add(j+1);
		}
		
		return results;
	}
	public static void main(String[] args) throws Exception
	{
		Solution solution=new Solution();
		int[] a={4,3,2,7,8,2,3,1};
		System.out.println(solution.findDisappearedNumbers(a));
		
		
		
		
	}
}
