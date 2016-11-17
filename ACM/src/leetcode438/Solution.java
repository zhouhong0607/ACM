package leetcode438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
	public List<Integer> findAnagrams(String s, String p)
	{
		List<Integer> res=new ArrayList<>();
		
		char[] cp=p.toCharArray();
		Arrays.sort(cp);
		p=String.valueOf(cp);
		
		 for(int i=0;i<=s.length()-p.length();i++)
		 {
			 String subS=s.substring(i, i+p.length());
			 char[] cs=subS.toCharArray();
			 Arrays.sort(cs);
			 subS=String.valueOf(cs);
			 if(subS.equals(p))
				 res.add(i);
		 }
		return res;
	}
	public static void main(String[] args)throws Exception
	{
		String s="abab";
		String p="ab";
		Solution solution=new Solution();
		System.out.println(solution.findAnagrams(s, p));
		
		
	}
}
