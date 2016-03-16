package poj1207;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner cin = new Scanner(System.in);
		int left;// 左区间
		int right;// 右区间
		int x;
		int y;
		
		
		while (cin.hasNext())
		{
			x = cin.nextInt();
			y = cin.nextInt();
			left = x < y ? x : y;
			right = x > y ? x : y;
		
			int max = 0;
			int circleLength;
			for (int j = left; j <= right; j++)
			{
				circleLength = calCircleLength(j);
				if (max < circleLength)
					max = circleLength;
			}
			System.out.println(x + " "+ y + " " + max);
		}

	}
	private static int calCircleLength(int number)
	{
		int i = 1;
		while (number != 1)
		{
			i++;
			if (number % 2==1)// 奇数
			{
				number = number * 3 + 1;
			} else
			{
				number = number / 2;
			}
		}
		return i;
	}
}
