package leetcode85;

public class Solution
{
	public int maximalRectangle(char[][] matrix)
	{
		if(matrix==null||matrix.length<1||matrix[0].length<1) return 0;
		int m=matrix.length;
		int n=matrix[0].length;
		int result=0;
		int[][] row=new int[m][n];
		int[][] col=new int[m][n];
		int[][] minCol=new int[m][n];
		int[][] minRow=new int[m][n];
		
		
		if(matrix[0][0]=='1')
		{
			row[0][0]=1;
			col[0][0]=1;
			minCol[0][0]=1;
			minRow[0][0]=1;
			result=1;
		}
		
		for(int k=1;k<m;k++)
		{
			if(matrix[k][0]=='1')
			{
				col[k][0]=1;
				minCol[k][0]=1;
				row[k][0]=row[k-1][0]+1;
				minRow[k][0]=row[k-1][0]+1;
				result=Math.max(result, row[k][0]);
			}
		}
		
		for(int l=1;l<n;l++)
		{
			if(matrix[0][l]=='1')
			{
				row[0][l]=1;
				minRow[0][l]=1;
				col[0][l]=col[0][l-1]+1;
				minCol[0][l]=col[0][l-1]+1;
				result=Math.max(result, col[0][l]);
			}
		}
		
		for(int i=1;i<m;i++)
			for(int j=1;j<n;j++)
			{
				if(matrix[i][j]=='1')
				{
					col[i][j]=col[i][j-1]+1;
					row[i][j]=row[i-1][j]+1;
					minCol[i][j]=Math.min(col[i][j-1],col[i-1][j-1])+1;
					minRow[i][j]=Math.min(row[i-1][j], row[i-1][j-1])+1;
					int max1=Math.max(minCol[i][j]*minRow[i][j], Math.max(col[i][j], row[i][j]));
					result=Math.max(max1, result);
				}                                                                                                                                                                                                                                                       
			}
		return result;
	}
	public static void main(String[] args) throws Exception
	{
//		char[][] nums={
//					  {'1','0','1','0','0'},
//				      {'1','0','1','1','1'},
//				      {'1','1','1','1','1'},
//				      {'1','0','0','1','0'},
//				      			};
		
//		char[][] nums={
//				  {'1','1'},
//				  {'1','1'}
//			      			};
		
		char[][] nums={
		  {'1','1','0','1'},
		  {'1','1','0','1'},
		  {'1','1','1','1'},
	      			};
		
		Solution solution=new Solution();
		System.out.println(solution.maximalRectangle(nums));
	}
}
