package leetcode165;

public class Solution
{
	public int compareVersion(String version1, String version2)
	{
		String[] num1 = version1.split("\\.");
		String[] num2 = version2.split("\\.");
		if (Integer.valueOf(num1[0]) < Integer.valueOf(num2[0]))
		{
			return -1;
		} else if (Integer.valueOf(num1[0]) > Integer.valueOf(num2[0]))
		{
			return 1;
		}else
		{
			if(Integer.valueOf(num1[1])<Integer.valueOf(num2[1]))
			{
				return -1;
			}else if (Integer.valueOf(num1[1])>Integer.valueOf(num2[1])) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	public static void main(String[] args ) throws Exception
	{
	Solution solution=new Solution();
	System.out.println(solution.compareVersion("1.1", "13.37"));
	}
}
