package leetcode54;

import java.util.LinkedList;
import java.util.List;

public class Solution
{
	public List<Integer> spiralOrder(int[][] matrix)
	{
		
		List<Integer> result=new LinkedList<>();
		if(matrix.length==0||matrix[0].length==0) return null;
		collector(matrix, 0, result);
		return result;
	}
	private void collector(int[][] matrix,int location,List<Integer> result)
	{
		if(location>(matrix.length-1)/2||location>(matrix[0].length-1)/2) return;
		for(int i=location;i<matrix[0].length-location;i++)
		{
			result.add(matrix[location][i]);
		}
		for(int j=location+1;j<matrix.length-location;j++)
		{
			result.add(matrix[j][matrix[0].length-1-location]);
		}
		for(int k=matrix[0].length-2-location;k>=location;k--)
		{
			if(matrix.length-1-location>location)
			result.add(matrix[matrix.length-1-location][k]);
		}
		for(int l=matrix.length-2-location;l>=location+1;l--)
		{
			if(location<matrix[0].length-1-location)
			result.add(matrix[l][location]);
		}
		collector(matrix, location+1, result);
		
	}
	public static void main(String[] args) throws Exception
	{
		int[][] matrix={{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
		Solution solution=new Solution();
		solution.spiralOrder(matrix);
		
	}
}
