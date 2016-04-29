package leetcode59;

public class Solution
{
	public int[][] generateMatrix(int n)
	{
		int[][] matrix = new int[n][n];
		generateMatrix(matrix, 0, n);
		return matrix;
	}

	private void generateMatrix(int[][] matrix, int location, int n)
	{
		if (location > (n - 1) / 2)
			return;
		int start = 0;
		int length = n - 1;// 每一次遍历的长度
		for (int k = 0; k < location; k++)
		{

			start += length * 4;
			length -= 2;
		}
		start++;// 每一次迭代的起始点

		if (n % 2 != 0 && location == (n - 1) / 2)
		{
			matrix[location][location] = start;
			return;
		}
		for (int i = 0; i < length; i++)
		{
			matrix[location][i + location] = start + i;
			matrix[i + location][n - 1 - location] = start + length + i;
			matrix[n - 1 - location][n - 1 - location - i] = start + length * 2 + i;
			matrix[n - 1 - location - i][location] = start + length * 3 + i;
		}
		generateMatrix(matrix, location + 1, n);

	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		solution.generateMatrix(4);
	}
}
