package leetcode400;

public class Solution
{
	//自己做的笨蛋方法
//	public int findNthDigit(int n)
//	{
//		if (n < 10)
//			return n;
//		long num = n;
//		int k = 1;
//		while (num > 0)
//		{
//			num = num - k * 9 * (long) Math.pow(10, k - 1);
//			k++;
//		}
//		num = num + (k - 1) * 9 * (long) Math.pow(10, k - 2);
//		long n1 = num / (k - 1);
//		long mod = num % (k - 1);
//		long a = (long) Math.pow(10, k - 2) + n1 + (mod == 0 ? -1 : 0);
//		long res = mod == 0 ? a % 10 : a / (long) Math.pow(10, k - 1 - mod) % 10;
//		return (int) res;
//	}

	public int findNthDigit(int n)
	{
		// For 1, 2 .., 9, return the result directly
		if (n <= 9)
		{
			return n;
		}

		int base = 1;

		// Determine the range
		// 10, 11, ..., 99: 90 * 2 digits in total, base = 2
		// 101, 102, 103, ..., 999: 900 * 3 digits in total, base = 3
		// ...
		while (n > 9 * Math.pow(10, base - 1) * base)
		{
			n = n - 9 * (int) Math.pow(10, base - 1) * base;
			base++;
		}

		// Now we should find out which number the answer follows. eg. if the
		// input is 15, the answer should follow on number "12", that's the
		// variable number for.
		int number = (int) Math.pow(10, base - 1) + (n - 1) / base;

		// Then we should find out which specific in the number "12". that's
		// what index for, for input 15, index = 0
		int index = (n - 1) % base;

		// The answer is the index-th digit of the variable number
		return Integer.toString(number).charAt(index) - '0';
	}

	public static void main(String[] args) throws Exception
	{
		int n = 1000000000;
		Solution solution = new Solution();
		System.out.print(solution.findNthDigit(n));
	}
}
