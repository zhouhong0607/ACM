package leetcode374;

public class Solution
{
	public int guessNumber(int n)
	{
		
		int low=1,high=n,res=low+(high-low)/2;
		while(guess(res)!=0)
		{
			if(guess(res)>0)
			{
				high=res-1;
			}else
			{
				low=res+1;
			}
			res=low+(high-low)/2;
		}
		return res;
	}
	public int guess(int v)
	{
		if(v<6)
		{
			return -1;
		}else if (v>6) {
			return 1;
			
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args)throws Exception
	{
		int n=10;
		Solution solution=new Solution();
		System.out.println(solution.guessNumber(n));
	}
	
}
