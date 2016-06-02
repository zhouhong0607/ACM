package leetcode345;

public class Solution
{
	public String reverseVowels(String s)
	{
		if(s==null) return null;
		int head=0,tail=s.length()-1;
		char[] cs=s.toCharArray();
		for(;head<tail;)
		{
			if(isVowels(cs[head])&&isVowels(cs[tail]))
			{
				char c=cs[head];
				cs[head]=cs[tail];
				cs[tail]=c;
				head++;
				tail--;
			}else if(isVowels(cs[head]))
			{
				tail--;
			}else
			{
				head++;
			}
		}
		return new String(cs);
		
	}
	private boolean isVowels(char c)
	{
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
	}
	
	public static void main(String[] args)throws Exception
	{
		String s="leetcode";
		Solution solution=new Solution();
		System.out.println(solution.reverseVowels(s));
	}
}
