package leetcode338;

public class Solution
{
	public int[] countBits(int num)
	{
		if(num==0) return new int[]{0};
		int[] result=new int[num+1];
		result[0]=0;
		int size=1;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			result[i]=result[i-size]+1;
			if(++count==size)
			{
				size*=2;
				count=0;
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		solution.countBits(15);
	}
}
