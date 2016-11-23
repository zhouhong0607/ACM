package leetcode396;

public class Solution
{
	// //笨蛋解法
	// public int maxRotateFunction(int[] A)
	// {
	// if(A==null||A.length<1) return 0;
	// long[] F = new long[A.length];
	// for (int i = 0; i < A.length; i++)
	// {
	// for (int j = 0; j < A.length; j++)
	// {
	// F[i] += j * A[(A.length - i + j) % A.length];
	// }
	// }
	// int res = (int) F[0];
	// for (long lo : F)
	// {
	// res=(int)Math.max(res, lo);
	// }
	// return res;
	// }

	
//	Consider we have 5 coins A,B,C,D,E
//
//	According to the problem statement
//	F(0) = (0A) + (1B) + (2C) + (3D) + (4E)
//	F(1) = (4A) + (0B) + (1C) + (2D) + (3E)
//	F(2) = (3A) + (4B) + (0C) + (1D) + (2*E)
//
//	This problem at a glance seem like a difficult problem. I am not very strong in mathematics, so this is how I visualize this problem
//
//	We can construct F(1) from F(0) by two step:
//	Step 1. taking away one count of each coin from F(0), this is done by subtracting "sum" from "iteration" in the code below
//	after step 1 F(0) = (-1A) + (0B) + (1C) + (2D) + (3*E)
//
//	Step 2. Add n times the element which didn't contributed in F(0), which is A. This is done by adding "A[j-1]len" in the code below.
//	after step 2 F(0) = (4A) + (0B) + (1C) + (2D) + (3E)
//
//	At this point F(0) can be considered as F(1) and F(2) to F(4) can be constructed by repeating the above steps.
//
//	Hope this explanation helps, cheers!
	
//	注!!  Since it goes a circle, either clockwise or anti-clockwise works;)
	
	//大牛解法
	public int maxRotateFunction(int[] A)
	{
		if (A.length == 0)
		{
			return 0;
		}

		int sum = 0, iteration = 0, len = A.length;

		for (int i = 0; i < len; i++)
		{
			sum += A[i];
			iteration += (A[i] * i);
		}

		int max = iteration;
		for (int j = 1; j < len; j++)
		{
			// for next iteration lets remove one entry value of each entry and
			// the prev 0 * k
			iteration = iteration - sum + A[j - 1] * len;
			max = Math.max(max, iteration);
		}

		return max;
	}

	public static void main(String[] args) throws Exception
	{
		int[] A =
		{ 4, 3, 2, 6 };
		Solution solution = new Solution();
		System.out.println(solution.maxRotateFunction(A));

	}
}
