package leetcode409;

import java.util.Arrays;

public class Solution
{
	public int longestPalindrome(String s)
	{
		int[] hash = new int[256];
		for (char c : s.toCharArray())
			hash[c]++;
		int res = 0;
		for (int i = hash.length - 1; i >= 0; i--)
		{
			
				res += hash[i]/2*2;
			
		}
		
		return res==s.length()? res:res+1;
	}

	public static void main(String[] args) throws Exception
	{

		String string = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		Solution solution = new Solution();

		System.out.println(solution.longestPalindrome(string));

	}
}
