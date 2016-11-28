package leetcode383;

public class Solution
{
	public boolean canConstruct(String ransomNote, String magazine)
	{
		int[] pat=new int[26];
		for(char c:magazine.toCharArray())
		{
			pat[c-'a']++;
		}
		for(char c:ransomNote.toCharArray())
		{
			pat[c-'a']--;
			if(pat[c-'a']<0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)throws Exception
	{
		String note="aa";
		String magazines="aab";
		Solution solution=new Solution();
		System.out.println(solution.canConstruct(note, magazines));
	}
}
