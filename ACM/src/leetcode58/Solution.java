package leetcode58;

public class Solution
{
	// 解法1
	// public int lengthOfLastWord(String s)
	// {
	// String[] ss=s.split(" ");
	// return ss.length<1?0:ss[ss.length-1].length();
	// }
	// 解法2
	// 

		public int lengthOfLastWord(String s)
		{
			int len = s.length();
			int i = len - 1;
			int empty = 0;
			if (s == null || len == 0)
				return 0;
			while (i >= 0 && s.charAt(i) == ' ')
			{
				i--;
				empty++;
			}
			while (i >= 0 && s.charAt(i) != ' ')
				i--;
			return len - empty - (i + 1);
		}
	

}
