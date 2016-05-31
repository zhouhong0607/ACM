package leetcode63;

public class Solution
{
	public int uniquePathsWithObstacles(int[][] obstacleGrid)
	{
		int m=obstacleGrid.length;
		int n=obstacleGrid[0].length;
			int[][] paths=new int[m][n];
			paths[0][0]=obstacleGrid[0][0]!=1?1:0;
			for(int i=1;i<m;i++)
			{
				paths[i][0]=obstacleGrid[i][0]!=1?paths[i-1][0]:0;
			}
			for(int j=1;j<n;j++)
			{
				paths[0][j]=obstacleGrid[0][j]!=1?paths[0][j-1]:0;
			}
			
			for(int p=1;p<m;p++)
				for(int q=1;q<n;q++)
					paths[p][q]=obstacleGrid[p][q]!=1?paths[p-1][q]+paths[p][q-1]:0;
			return paths[m-1][n-1];
	}
	
	public static void main(String[] args) throws Exception
	{
		int[][] nums={
				{0,1}
					};
		Solution solution=new Solution();
		System.out.println(solution.uniquePathsWithObstacles(nums));
	}
}
