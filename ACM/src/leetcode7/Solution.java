package leetcode7;

public class Solution
{
	public int reverse(int x)
	{
		boolean negative=x<0?true:false;
		long result=0;
		x=Math.abs(x);
		while(x!=0)
		{
			result=result*10+x%10;
			x/=10;
		}
		result= negative?-result:result;
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)
			result=0;
		
		return (int)result;
	}
	
	public static void main(String[] args)throws Exception
	{
		int num=-111;
		System.out.println(num%10);
	}
	
}
