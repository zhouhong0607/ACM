package leetcode165;

public class Solution
{
	public int compareVersion(String version1, String version2)
	{

		String[] num1 = version1.split("\\.");
		String[] num2 = version2.split("\\.");
		int res = 0;
		int i;
		for ( i = 0;res==0&& (i < num1.length || i < num2.length); i++)
		{
			int val1=i<num1.length?Integer.valueOf(num1[i]):0;
			int val2=i<num2.length?Integer.valueOf(num2[i]):0;
			
			if (val1<val2)
			{
				res = -1;
			} else if (val1>val2)
			{
				res = 1;
			} else
			{
				res = 0;
			}
		}
		return res;
	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		System.out.println(solution.compareVersion("0.1", "1.0"));
	}
}
