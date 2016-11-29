package leetcode459;

public class Solution
{
	// 大牛解法
	// 1.First char of input string is first char of repeated substring
	// 2.Last char of input string is last char of repeated substring
	// 3.Let S1 = S + S (where S in input string)
	// 4.Remove 1 and last char of S1. Let this be S2
	// 5.If S exists in S2 then return true else false
	// 6.Let i be index in S2 where S starts then repeated substring length i +
	// 1 and repeated substring S[0: i+1]

	// public boolean repeatedSubstringPattern(String str)
	// {
	// StringBuilder sBuilder=new StringBuilder();
	// sBuilder.append(str);
	// sBuilder.append(str);
	// String cut=sBuilder.toString().substring(1, 2*str.length()-1);
	// if(cut.contains(str))
	// return true;
	// return false;
	// }

	public boolean repeatedSubstringPattern(String str)
	{
		int l = str.length();
		for (int i = l / 2; i >= 1; i--)
		{
			if (l % i == 0)
			{
				int m = l / i;
				String subS = str.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < m; j++)
				{
					sb.append(subS);
				}
				if (sb.toString().equals(str))
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception
	{
		String string = "abaababaab";
		Solution solution = new Solution();
		System.out.println(solution.repeatedSubstringPattern(string));

	}
}
