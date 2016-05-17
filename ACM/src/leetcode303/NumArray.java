package leetcode303;

public class NumArray
{
	int[] record;
	public NumArray(int[] nums)
	{
		int n=nums.length;
		if(nums.length<1) return;
		record=new int[n+1];
		record[0]=0;
		for(int i=1;i<n+1;i++)
		{
			record[i]=record[i-1]+nums[i-1];
		}
		
	}

	public int sumRange(int i, int j)
	{
		return  i>j?record[i+1]-record[j]:record[j+1]-record[i];
	}
	public static void main(String[] args)throws Exception
	{
		int[] nums={-2,0,3,-5,2,-1};
		NumArray numArray=new NumArray(nums);
	System.out.println(numArray.sumRange(0, 2));	
	System.out.println(numArray.sumRange(2, 5));	
	System.out.println(numArray.sumRange(0, 5));	
		
	}
}

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
