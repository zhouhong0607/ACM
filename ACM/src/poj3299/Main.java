package poj3299;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		double T, D, H;

		String t;
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext())
		{

			T = 200;
			D = 200;
			H = 200;

			for (int i = 0; i < 2; i++)
			{
				t = cin.next();
				if (t.contains("E"))
					return;
				if (t.contains("T"))
					T = cin.nextDouble();

				if (t.contains("D"))
					D = cin.nextDouble();

				if (t.contains("H"))
					H = cin.nextDouble();
			}
			if (T == 200)
			{
				T = H - 0.5555 * (6.11 * Math.exp(5417.7530 * (1.0 / 273.16 - 1.0 / (D + 273.16))) - 10.0);
			} else if (H == 200)
			{
				H = T + 0.5555 * (6.11 * Math.exp(5417.7530 * (1.0 / 273.16 - 1.0 / (D + 273.16))) - 10.0);
			} else
			{
				D = 1/((1/273.16)-((Math.log((((H-T)/0.5555)+10.0)/6.11))/5417.7530))-273.16; 
			}
			System.out.println("T " + String.format("%.1f", T) + " D " + String.format("%.1f", D) + " H "
					+ String.format("%.1f", H));
		}

	}
}
