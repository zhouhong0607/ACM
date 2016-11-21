package leetcode441;

public class Solution
{
	public int arrangeCoins(int n)
	{
	
		 return (int)(-0.5+Math.sqrt(1+8.0*n)/2.0);
	}
	public static void main(String[] args)throws Exception
	{
		int n=1804289383;
		Solution solution=new Solution();
		System.out.println(solution.arrangeCoins(n));
		
		
	}
}
