package leetcode279;

public class Solution
{
	public int numSquares(int n)
	{
		int[] count=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			double maxD=Math.sqrt(i);
			int maxI=(int)maxD;
			if(maxI==maxD)
			{
				count[i]=1;
				continue;
			}
			for(int j=1;j<=maxI;j++)
			{
				count[i]=(count[i]==0)?count[i-j*j]+1:Math.min(count[i], count[i-j*j]+1);
			}
		}
		return count[n];
	}
	public static void main(String[] args)throws Exception
	{
		Solution solution=new Solution();
		for(int i=0;i<=16;i++)
		System.out.println(solution.numSquares(i));
	}
}
