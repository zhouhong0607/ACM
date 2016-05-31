package leetcode64;

public class Solution
{
	public int minPathSum(int[][] grid)
	{
		int m=grid.length,n=grid[0].length;
		int[][] sumPath=new int[m][n];
		sumPath[0][0]=grid[0][0];
		for(int i=1;i<m;i++)
			sumPath[i][0]=sumPath[i-1][0]+grid[i][0];
		for(int j=1;j<n;j++)
			sumPath[0][j]=sumPath[0][j-1]+grid[0][j];
		for(int p=1;p<m;p++)
			for(int q=1;q<n;q++)
				sumPath[p][q]=Math.min(sumPath[p-1][q], sumPath[p][q-1])+grid[p][q];
		return sumPath[m-1][n-1];
	}
}
