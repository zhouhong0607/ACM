package leetcode233;

public class Solution
{
	public int countDigitOne(int n)
	{
		if(n<1) return 0;
		if(n<10) return 1;
		int bit=getBitNum(n);
		int minNum=(int)Math.pow(10, bit-1);
	
		
		int i=n/minNum;
		
		if(i>1)
		{
		return countDigitOne(2*minNum-1)+countDigitOne(n-minNum*i)+(i-2)*countDigitOne(minNum-1);
		}
		else
		{
//			int offsetNum=minNum;
//			for(int j=offsetBit;i>0;i--)
//			{
//				offsetNum+=Math.pow(10, j-1);
//			}
//			if(n<offsetNum)
//			{
//				offsetBit=0;
//			}
			
			return n-minNum+1+countDigitOne(n-minNum)+countDigitOne(minNum-1);
		}
		
	}
	
	private int getBitNum(int n)
	{
		int i=0;
		while(n!=0)
		{
			i++;
			n/=10;
		}
		return i;
	}
	
	public static void main(String[] args) throws Exception
	{
		
		Solution solution=new Solution();
		int n=20;
		System.out.println(solution.countDigitOne(n));
	}
	
}
