package leetcode221;

public class Solution
{
	public int maximalSquare(char[][] matrix)
	{
		if(matrix==null||matrix.length<1||matrix[0].length<1) return 0;
		int m=matrix.length,n=matrix[0].length,result=0;
		int[][] record=new int[m+1][n+1];
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
			{
				if(matrix[i-1][j-1]=='1')
				{
					record[i][j]=Math.min(Math.min(record[i-1][j], record[i][j-1]), record[i-1][j-1])+1;
					result=Math.max(result, record[i][j]);
				}
			}
		
		return result*result;
		
	}
}
