package leetcode96;

public class Solution
{
	// public int numTrees(int n)
	// {
	// if(n<=2) return n;
	// int[] result=new int[n];
	// result[0]=1;
	// result[1]=2;
	// for(int i=2;i<n;i++)
	// {
	// result[i]=2*result[i-2]+2*result[i-1];
	// }
	// return result[n-1];
	// }

	public int numTrees(int n)
	{
		int[] G = new int[n + 1];
		G[0] = G[1] = 1;

		for (int i = 2; i <= n; ++i)
		{
			for (int j = 1; j <= i; ++j)
			{
				G[i] += G[j - 1] * G[i - j];
			}
		}

		return G[n];
	}
}
