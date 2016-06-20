package leetcode299;

public class Solution
{
	public String getHint(String secret, String guess)
	{
		int bulls=0,cows=0;
		int[] index=new int[10];
		
		for(int i=0;i<secret.length();i++)
		{
			if(secret.charAt(i)==guess.charAt(i))
			{
					bulls++;
			}else
			{
				index[secret.charAt(i)-'0']++;
			}
		}
		
		for(int j=0;j<secret.length();j++)
		{
			if(index[guess.charAt(j)-'0']!=0&&secret.charAt(j)!=guess.charAt(j))
			{
					cows++;
					index[guess.charAt(j)-'0']--;
			
			}
		}
		return bulls+"A"+cows+"B";
	}
}
