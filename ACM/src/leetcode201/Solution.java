package leetcode201;

public class Solution
{
	public int rangeBitwiseAnd(int m, int n)
	{
		int location = -1;
		int c = m & n;
		for (int i = 30; i >= 0; i--)
		{
			if ((m & (1 << i)) != (n & (1 << i)))
			{
				location = i;
				break;
			}

		}
		for (int j = location; j >= 0; j--)
		{
			c&=~(1<<j);
		}

		return c;
	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		solution.rangeBitwiseAnd(2, 2);
	}
}
