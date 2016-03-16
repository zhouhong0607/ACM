package poj1005;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double[] r2=new double[100];//存储每年的半径的平方
		r2[0]=0.0;//起始半径为0
		int dataNum;//输入数据的个数
		double d;//距离 的平方
		Scanner cin =new Scanner(System.in);
		dataNum=cin.nextInt();
		int i;
		for(i=0;i<dataNum;i++)
		{
			d=Math.pow(cin.nextDouble(),2.0)+Math.pow(cin.nextDouble(),2.0);//计算距离的平方
			int j;
			for(j=1;i<r2.length;j++)
			{
				if(r2[j]==0.0)
				r2[j]=100.0/(Math.PI)+r2[j-1];
				if(r2[j]>=d)
					break;
			}
			System.out.println("Property "+(i+1)+": This property will begin eroding in year "+j+".");
			
		}
		System.out.println("END OF OUTPUT.");
		
	}
}
