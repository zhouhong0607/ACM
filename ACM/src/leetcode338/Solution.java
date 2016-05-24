package leetcode338;

public class Solution
{
	public int[] countBits(int num)
	{
		int[] bitsCount=new int[num+1];
		if(num==0) return bitsCount;
		bitsCount[1]=1;
		for(int i=2;i<=num;i++)
		{
			
			int firstNum =(int)Math.pow(2, (int)(Math.log10(i)/Math.log10(2)));
			int dif=i-firstNum;
			if(dif==0)
			{
				bitsCount[i]=1;
			}else if(dif==(int)Math.pow(2.0, (int)(Math.log10(dif)/Math.log10(2.0))))
			{
//				bitsCount[i]=(int)(Math.log10(dif)/Math.log10(2.0));
			}else if (dif+1==(int)Math.pow(2.0, (int)(Math.log10(dif+1)/Math.log10(2.0)))) 
			{
				bitsCount[i]=bitsCount[i-1]+1;
			}else 
			{
				bitsCount[i]=bitsCount[i-1];
			}
		}
		
		return bitsCount;
	}
	
	public static void main(String[] args) throws Exception
	{
		Solution solution=new Solution();
		solution.countBits(15);
	}
}
