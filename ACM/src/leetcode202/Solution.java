package leetcode202;

import java.util.HashSet;
import java.util.Set;

public class Solution
{
	public boolean isHappy(int n)
	{
		Set<Integer> set=new HashSet<>();
		while(!set.contains(n))
		{
			set.add(n);
			int val=0;
			while(n!=0)
			{
				val+=Math.pow(n%10, 2);
				n/=10;
			}
			if(val==1) return true;
			n=val;
		}
		return false;
	}
	
	public static void main(String[] args)throws Exception
	{
		int n=1;
		Solution solution=new Solution();
		solution.isHappy(n);
	}
}
