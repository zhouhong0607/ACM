package leetcode73;

public class Solution
{
	 public void setZeroes(int[][] matrix) {
	        int m=matrix.length;
	        int n=matrix[0].length;
	        
	        boolean[] row=new boolean[m];
	        boolean[] col=new boolean[n];
	      for (int i = 0; i < m; i++)
			{
				for (int j = 0; j < n;j++)
				{
					if (matrix[i][j] == 0)
					{
						row[i]=true;
						col[j]=true;
					}
					
				}

			}
			
			for(int p=0;p<m;p++)
			{
			    if(row[p])
			    {
			        for(int z=0;z<n;z++)
			        matrix[p][z]=0;
			    }
			}
			
			for(int q=0;q<n;q++)
			{
			    if(col[q])
			    {
			        for(int x=0;x<m;x++)
			        matrix[x][q]=0;
			    }
			}
			
			
			
	    }
}
