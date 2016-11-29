package leetcode455;

import java.util.Arrays;

public class Solution
{
	public int findContentChildren(int[] g, int[] s)
	{
		Arrays.sort(g);
		Arrays.sort(s);
		int res=0;
		int index=0;
		for(int i=0;i<g.length;i++)
		{
			for(int j=index;j<s.length;j++)
			{
				if(s[j]>=g[i])
				{
					res++;
					index=j+1;
					break;
				}
			}
		}
		return res;
	}
	public static void main(String[] ARGS)throws Exception
	{
		Solution solution=new Solution();
		int[] g={1,2};
		int[] s={1,2,3};
		System.out.println(solution.findContentChildren(g, s));
	}
}
