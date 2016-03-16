package poj1003;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		double[] result=new double[300];
		Scanner cin=new Scanner(System.in);
		double in;
		result[0]=0.0;
		while((in=cin.nextDouble())!=0.0)
		{
			int i;
			for( i=1;i<result.length;i++)
			{
				if(result[i]==0)
				result[i]=result[i-1]+1.0/(1.0+i);
				if(result[i]>in)
				break;
			}
			System.out.println(i+" card(s)");
			
		}
		
	}
}
