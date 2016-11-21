package leetcode463;

import javax.security.auth.kerberos.KerberosKey;

public class Solution
{
	public int islandPerimeter(int[][] grid)
	{
		if(grid==null||grid.length==0||grid[0].length==0) return 0;
		int count=0;
		int edge=0;
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				if(grid[i][j]==1) 
				{
					count++;
					if(j>0&&grid[i][j-1]==1)
						edge++;
					if(i>0&&grid[i-1][j]==1)
						edge++;
				}
			}
		}
		return count*4-edge*2;
	}
	
	public static void main(String[] args) throws Exception
	{
		int[][] grid={
				{0,1,0,0},
				{1,1,1,0},
				{0,1,0,0},
				{1,1,0,0}
		};
		
		Solution solution=new Solution();
		System.out.println(solution.islandPerimeter(grid));
	}
	
}
