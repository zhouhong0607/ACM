package leetcode118;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<List<Integer>> generate(int numRows)
	{
		
		List<List<Integer>> result=new ArrayList<>();
		if(numRows<=0) return result;
		List<Integer> first=new ArrayList<>();
		first.add(1);
		result.add(first);
		for(int i=1;i<numRows;i++)
		{
			List<Integer> line=new ArrayList<>();
			line.add(1);
			for(int j=1;j<i;j++)
			{
				line.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
			}
			line.add(1);
			result.add(line);
		}
		return result;
	}
}
