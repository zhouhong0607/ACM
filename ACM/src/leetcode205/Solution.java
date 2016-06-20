package leetcode205;


public class Solution
{
	public boolean isIsomorphic(String s, String t)
	{
		int[] maps = new int[256];
		int[] mapt = new int[256];
		for (int i = 0; i < s.length(); i++)
		{
			if (maps[s.charAt(i)] == 0)
				maps[s.charAt(i)] = i+1;

			if (mapt[t.charAt(i)] == 0)
				mapt[t.charAt(i)] = i+1;

			if (maps[s.charAt(i)] != mapt[t.charAt(i)])
				return false;
		}
		return true;
	}
	
	public static void main(String[] arg)
	{
		Solution solution=new Solution();
		solution.isIsomorphic("ab", "aa");
	}
	
}
