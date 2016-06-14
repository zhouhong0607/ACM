package leetcode231;

public class Solution
{
	public boolean isPowerOfTwo(int n)
	{
		if(n<=0) return false;
		return Math.pow(2, (int)(Math.log10(n)/Math.log10(2))) ==n;
	}
	
	public static void main(String[] args)throws Exception
	{
		Solution solution=new Solution();
	System.out.println(solution.isPowerOfTwo(0));
	}
}
