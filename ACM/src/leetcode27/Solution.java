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
				int c=nums[i];
				nums[i]=nums[j];
				nums[j]=c;
				i++;
			}
		}
	
		return i;
	}
	public static void main(String[] args) throws Exception
	{
		int[] nums={3,2,2,3};
		Solution solution=new Solution();
		solution.removeElement(nums, 3);
	}

}
