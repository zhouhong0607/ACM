package leetcode119;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<Integer> getRow(int rowIndex)
	{
		List<Integer> line=new ArrayList<>();
		if(rowIndex<0) return line;
		long cur=1;
		line.add((int)cur);
		for(int i=1;i<=rowIndex;i++)
		{
			cur=cur*(rowIndex-i+1)/i;
			line.add((int)cur);
		}
		return line;
	}
	
	public static void main(String[] arg)
	{
		Solution solution=new Solution();
		solution.getRow(2);
	}
}
