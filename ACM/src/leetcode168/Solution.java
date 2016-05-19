package leetcode168;

public class Solution
{
	public String convertToTitle(int n)
	{
		String s="";
		int mo=(n-1)%26;
		 n=(n-1)/26;
		while(mo>=0)
		{
			s=(char)('A'+mo)+s;
			mo=(n-1)%26;
			n=(n-1)/26;
		}
		return s;
	}
	public static void main(String[] args)throws Exception
	{
		System.out.println(-1/26==0);
		Solution solution=new Solution();
		solution.convertToTitle(1);
		
	}
}
