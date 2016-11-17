package leetcode136;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
	/**
	 * hashMap 解法 24ms
	 * 
	 * @param nums
	 * @return
	 */
	// public int singleNumber(int[] nums)
	// {
	// Map<Integer, Integer> count=new HashMap<>();
	// int result=-1;
	// for(int i=0;i<nums.length;i++)
	// {
	// if(!count.containsKey(nums[i]))
	// count.put(nums[i], 1);
	// else {
	// count.put(nums[i], 2);
	// }
	// }
	// for(int key:count.keySet())
	// {
	// if(count.get(key)==1)
	// result=key;
	// }
	// return result;
	// }
	/**
	 * 不用额外内存解法
	 * 
	 * 利用 XOR性质   A^=A -> 0
	 * 			0^=B  ->B
	 * 			A^=A^=B ->B
	 * 
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums)
	{
		for (int i = 0; i < nums.length - 1; i++)
		{
			nums[i + 1] ^= nums[i];
		}
		return nums[nums.length - 1];
	}
	
	public static void main(String[] args)throws Exception
	{
		int[] nums={5,2,3,2,5};
		Solution solution=new Solution();
		solution.singleNumber(nums);
		
		
		
	}

}
