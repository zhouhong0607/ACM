package leetcode1;

public class Solution
{
	 public int[] twoSum(int[] nums, int target) {
	     
	        for(int i=0;i<nums.length-1;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            if(nums[i]+nums[j]==target)
	            {
	                int[] results={i,j};
	                return results;
	            }
	        }
	        
	        int[] no=new int[2];
	        return  no;
	        
	    }
}
