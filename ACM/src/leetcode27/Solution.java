package leetcode27;

public class Solution
{
	public int removeElement(int[] nums, int val)
	{
		if (nums == null || nums.length < 1)
			return 0;
		int i, j;
		for (i = 0, j = 0; j < nums.length; j++)
		{
			if (nums[j] != val)
			{
				swap(nums, i, j);
				i++;
			}
			j++;
		}
		return i;
	}

	private void swap(int[] nums, int a, int b)
	{
		int c = nums[a];
		nums[a] = nums[b];
		nums[b] = c;
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums={3,2,2,3};
		nums=new int[3];
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
