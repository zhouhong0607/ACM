package leetcode91;

public class Solution
{
//	public int numDecodings(String s)
//	{
//		char[] cs = s.toCharArray();
//		int[] count = new int[cs.length + 1];
//		count[0] = 0;
//		if (cs.length > 0)
//			count[1] = (cs[0] != '0') ? 1 : 0;
//		for (int i = 2; i < count.length; i++)
//		{
//			if (cs[i - 1] == '0')
//			{
//			continue;
//			} else
//				count[i] = ((cs[i - 2] - '0') * 10 + (cs[i - 1] - '0')) <= 26
//						? count[i - 1] + ((i - 2) > 0 ? count[i - 2] : 1) : count[i - 1];
//		}
//		return count[cs.length];
//	}

	public int numDecodings(String s)
	{
		int n = s.length();
		if (n == 0)
			return 0;

		int[] memo = new int[n + 1];
		memo[n] = 1;
		memo[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0;

		for (int i = n - 2; i >= 0; i--)
			if (s.charAt(i) == '0')
				continue;
			else
				memo[i] = (Integer.parseInt(s.substring(i, i + 2)) <= 26) ? memo[i + 1] + memo[i + 2] : memo[i + 1];

		return memo[0];
	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		String s = "10";
		System.out.println(solution.numDecodings(s));
	}

}
