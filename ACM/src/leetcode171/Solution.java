package leetcode171;

public class Solution
{
	public int titleToNumber(String s)
	{
		if(s==null||s.length()<1) return 0;
		char[] cs=s.toCharArray();
		int result=0;
		for(int i=0;i<cs.length;i++)
		{
			result=result*26+cs[i]-'A'+1;
		}
		return result;
	}
	public static void main(String[] args)throws Exception
	{
		String s="AA";
		Solution solution=new Solution();
		solution.titleToNumber(s);
		
	}
}
