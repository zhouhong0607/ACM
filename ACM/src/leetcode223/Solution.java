package leetcode223;

import java.util.Arrays;

public class Solution
{
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H)
	{
		long[] x={A,C,E,G};
		long[] y={B,D,F,H};
		long[] x1={A,C,E,G},y1={B,D,F,H};
		Arrays.sort(x1);
		Arrays.sort(y1);
		long x_l_1=x[1]-x[0];
		long x_l_2=x[3]-x[2];
		long x_l_12=x1[3]-x1[0];
		long y_l_1=y[1]-y[0];
		long y_l_2=y[3]-y[2];
		long y_l_12=y1[3]-y1[0];
		if((x_l_1+x_l_2<=x_l_12) || (y_l_1+y_l_2<=y_l_12) )
		{
			return (int)(x_l_1*y_l_1+x_l_2*y_l_2);
		}else
		{
			long x1_l=x1[2]-x1[1];
			long y1_l=y1[2]-y1[1];
			return (int)(x_l_1*y_l_1+x_l_2*y_l_2-x1_l*y1_l);
		}
		
	}
	
	public static void main(String[] args)throws Exception
	{
		Solution solution=new Solution();
		System.out.println(solution.computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
		
	}
	
}
