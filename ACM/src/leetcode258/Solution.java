package leetcode258;

public class Solution
{
	public int addDigits(int num)
	{
		int sum;

		do
		{
			sum = 0;
			int x = num;
			while (x > 0)
			{
				sum += x % 10;
				x /= 10;
			}
			num = sum;
		} while (sum >= 10);

		return sum;
	}

//	public int addDigits(int num)
//	{
//		if (num == 0)
//		{
//			return 0;
//		}
//		if (num % 9 == 0)
//		{
//			return 9;
//		} else
//		{
//			return num % 9;
//		}
//	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		solution.addDigits(38);

	}
}
