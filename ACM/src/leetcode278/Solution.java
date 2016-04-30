package leetcode278;

import java.math.BigInteger;

public class Solution 
{
	public int firstBadVersion(int n)
	{
		int head = 0;
		int tail = n;

		while (head<tail)
		{
			
			int mid = head+(tail-head)/2;
			if (isBadVersion(mid))
			{
				tail = mid;
			} else
			{
				head = mid+1;
			}
		}
		return head;
	}
	
	
	private boolean isBadVersion(int n)
	{
		int wrongVersion=1702766719;
		if(n>=wrongVersion)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws Exception
	{
		int n=2126753390;
		Solution solution=new Solution();
		solution.firstBadVersion(n);
	}

}