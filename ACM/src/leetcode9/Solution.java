package leetcode9;

public class Solution
{
//	public boolean isPalindrome(int x)
//	{
//		if (x < 0)
//			return false;
//		int len = 0;
//		int num = x;
//		while (x != 0)
//		{
//			len++;
//			x = x / 10;
//		}
//		for (int i = 1; i <= len / 2; i++)
//		{
//			int a = (num / (int) Math.pow(10, len - i)) % 10;
//			int b = (num / (int) Math.pow(10, i - 1)) % 10;
//			if (a != b)
//				return false;
//		}
//		return true;
//	}

	public boolean isPalindrome(int x)
	{
		if (x < 0)
			return false;
		int ans = 0;
		int num = x;
		while (num > 0)
		{
			ans = ans * 10 + num % 10;
			num = num / 10;
		}
		if (ans != x)
			return false;
		return true;
	}

	public static void main(String[] args) throws Exception
	{
		int i = -2147447412;
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome(i));
	}

}
