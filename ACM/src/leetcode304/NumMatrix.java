package leetcode304;

public class NumMatrix
{
	int[] record;
	int row;
	int col;
	public NumMatrix(int[][] matrix)
	{
		if(matrix==null||matrix.length<1||matrix[0].length<1) return;
		
		 row=matrix.length;
		 col=matrix[0].length;
		record=new int[row*col+1];
		for(int i=0;i<record.length-1;i++)
		{
			record[i+1]=record[i]+matrix[i/col][i%col];
		}
		
		
	}

	public int sumRegion(int row1, int col1, int row2, int col2)
	{
		int sum=0;
		for(int i=row1;i<=row2;i++)
		{
			sum+=record[i*col+col2+1]-record[i*col+col1];
		}
		return sum;
	}
}

//private int[][] dp;
//
//public NumMatrix(int[][] matrix) {
//    if(   matrix           == null
//       || matrix.length    == 0
//       || matrix[0].length == 0   ){
//        return;   
//    }
//
//    int m = matrix.length;
//    int n = matrix[0].length;
//
//    dp = new int[m + 1][n + 1];
//    for(int i = 1; i <= m; i++){
//        for(int j = 1; j <= n; j++){
//            dp[i][j] = dp[i - 1][j] + dp[i][j - 1] -dp[i - 1][j - 1] + matrix[i - 1][j - 1] ;
//        }
//    }
//}
//
//public int sumRegion(int row1, int col1, int row2, int col2) {
//    int iMin = Math.min(row1, row2);
//    int iMax = Math.max(row1, row2);
//
//    int jMin = Math.min(col1, col2);
//    int jMax = Math.max(col1, col2);
//
//    return dp[iMax + 1][jMax + 1] - dp[iMax + 1][jMin] - dp[iMin][jMax + 1] + dp[iMin][jMin];    
//}







// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);