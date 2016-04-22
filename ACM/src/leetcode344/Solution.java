package leetcode344;

public class Solution
{
	public String reverseString(String s)
	{
		if(s==null) return null;
		char[] cs=s.toCharArray();
		for(int i=0;i<cs.length/2;i++)
		{
			char tmp=cs[i];
			cs[i]=cs[cs.length-i-1];
			cs[cs.length-i-1]=tmp;
		}
		String result=String.valueOf(cs);
		return result;
	}
	public static void main(String[] args)throws Exception
	{
		Solution solution=new Solution();
		solution.reverseString("Helloo");
	}
}
