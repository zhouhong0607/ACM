package leetcode125;

public class Solution
{
	public boolean isPalindrome(String s)
	{
		char[] cs=s.toCharArray();
		for(int i=0,j=s.length()-1;i<j;)
		{
			if(!isLetter(cs[i])&&!isLetter(cs[j]))
			{
				i++;j--;continue;
			}else if (!isLetter(cs[i]))
			{
				i++;continue;
			}else if (!isLetter(cs[j]))
			{
				j--;continue;
			}else
			{
				if(Character.toLowerCase(cs[i])!=Character.toLowerCase(cs[j]))
					return false;
				i++;j--;
			}
		}
		return true;
	}
	
	private boolean isLetter(char c)
	{
		return     Character.isLetter(c);
	}
}
