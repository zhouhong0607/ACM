package poj1004;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		double sum=0.0;
		double ave=0.0;
		Scanner cin=new Scanner(System.in);
		for(int i=0;i<12;i++)
		{
			sum+=cin.nextDouble();
		}
		
		System.out.println("$"+String.format("%.2f", sum/12.00)+"\n");
		
	}
}
