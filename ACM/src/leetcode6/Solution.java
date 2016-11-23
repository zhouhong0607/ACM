package leetcode6;

public class Solution
{
	public String convert(String s, int numRows)
	{
		if (numRows == 1)
			return s;
		StringBuilder sb = new StringBuilder();
		int cycle = 2 * numRows - 2;
		// add the first row
		for (int i = 0; i < s.length(); i += cycle)
		{
			sb.append(s.charAt(i));
		}
		// add the middle (numRows-2) rows one by one
		for (int k = 1; k <= numRows - 2; k++)
		{
			for (int i = 0; i + k < s.length(); i += cycle)
			{
				sb.append(s.charAt(i + k));
				if (i + cycle - k < s.length())
					sb.append(s.charAt(i + cycle - k));
			}
		}
		// add the last row
		for (int i = 0; i + numRows - 1 < s.length(); i += cycle)
		{
			sb.append(s.charAt(i + numRows - 1));
		}
		return sb.toString();
	}
}
