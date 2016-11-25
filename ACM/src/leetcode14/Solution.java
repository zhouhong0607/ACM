package leetcode14;

import java.util.Arrays;

public class Solution
{
//	public String longestCommonPrefix(String[] strs)
//	{
//		if (strs == null || strs.length < 1)
//			return "";
//		int maxLength = 0;
//
//		for (int i = 0; i < strs.length; i++)
//		{
//			if (strs[i] == null || strs[i].length() < 1)
//				return "";
//
//			if (strs[i].length() > maxLength)
//				maxLength = strs[i].length();
//		}
//		int k;
//		for (k = 0; k < maxLength; k++)
//		{
//			if (k >= strs[0].length())
//				break;
//			char c = strs[0].charAt(k);
//			int j;
//			for (j = 0; j < strs.length; j++)
//			{
//				if (k >= strs[j].length() || strs[j].charAt(k) != c)
//					break;
//			}
//			if (j != strs.length)
//				break;
//		}
//		return strs[0].substring(0, k);
//	}

	public String longestCommonPrefix(String[] strs)
	{
		if (strs.length == 1)
		{
			return strs[0];
		}
		Arrays.sort(strs);
		int index = 0;
		while (strs.length > 1 && index < strs[0].length() && index < strs[strs.length - 1].length()
				&& strs[0].charAt(index) == strs[strs.length - 1].charAt(index))
		{
			index++;
		}
		return index > 0 ? strs[0].substring(0, index) : "";
	}
	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		String[] ss =
		{ "aab", "abcc","aaccc" };
		System.out.println(solution.longestCommonPrefix(ss));
	}
}
