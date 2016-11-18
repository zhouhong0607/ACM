package leetcode438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
	/**
	 * 最笨的方法（超时）
	 * 
	 * @param s
	 * @param p
	 * @return
	 */
//	public List<Integer> findAnagrams(String s, String p)
//	{
//		List<Integer> res = new ArrayList<>();
//		char[] cp = p.toCharArray();
//		Arrays.sort(cp);
//		p = String.valueOf(cp);
//		for (int i = 0; i <= s.length() - p.length(); i++)
//		{
//			String subS = s.substring(i, i + p.length());
//			char[] cs = subS.toCharArray();
//			Arrays.sort(cs);
//			subS = String.valueOf(cs);
//			if (subS.equals(p))
//				res.add(i);
//		}
//		return res;
//	}

	
	/**
	 * 滑动窗  计数方法  O（n）
	 * @param s
	 * @param p
	 * @return
	 */
	public List<Integer> findAnagrams(String s, String p)
	{
		List<Integer> res=new ArrayList<>();
		if(s==null||p==null||s.length()==0||p.length()==0) return res;
		int[] hash=new int[256];
		for(char c:p.toCharArray())
		{
			hash[c]++;
		}
		int left=0;
		int right=0;
		int count=p.length();
		while(right<s.length())
		{
			if(hash[s.charAt(right++)]-->0)
				count--;
			if(count==0)
				res.add(left);
		
			if(right-left==p.length()&&hash[s.charAt(left++)]++>=0)
			
					count++;
		}
		return res;
	}

	public static void main(String[] args) throws Exception
	{
		String s = "cbaebabacd";
		String p = "abc";
		Solution solution = new Solution();
		System.out.println(solution.findAnagrams(s, p));
	}
}
