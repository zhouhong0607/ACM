package leetcode66;

public class Solution
{
	public int[] plusOne(int[] digits)
	{
		if(digits==null||digits.length<1) return null;
		int cur;
		
		for(cur=digits.length-1;cur>=0||digits[cur]%9==0&&digits[cur]!=0;cur--)
		{
			digits[cur]=0;
			
		}
		if(cur<0)
		{
			int[] tmp=new int[digits.length+1];
			tmp[0]=1;
			for(int i=1;i<tmp.length;i++)
				tmp[i]=0;
			digits=tmp;
		}else
		{
			digits[cur]++;
		}
		return digits;
		
	}
	public static void main(String[] args)throws Exception
	{
//		Solution solution=new Solution();
		int[] nums={1};
//		solution.plusOne(nums);
		int[] numss=new int[nums.length+1];
		System.out.println(numss);
	}
}
