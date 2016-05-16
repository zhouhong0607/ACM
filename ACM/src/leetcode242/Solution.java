package leetcode242;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Solution
{
	// For example,
	// s = "anagram", t = "nagaram", return true.
	// s = "rat", t = "car", return false.

	// public boolean isAnagram(String s, String t)
	// {
	// char[] c1=s.toCharArray();
	// char[] c2=t.toCharArray();
	// if(c1.length!=c2.length) return false;
	//
	// Arrays.sort(c1);
	// Arrays.sort(c2);
	//
	// for(int i=0;i<c1.length;i++)
	// {
	// if(c1[i]!=c2[i]) return false;
	// }
	// return true;
	// }

	 public boolean isAnagram(String s, String t) {
	 if (s.length() != t.length()) return false;
	 char[] cs = s.toCharArray();
	 char[] ct = t.toCharArray();
	 int[] map = new int[127];
	 int count = 0;
	 for (int i = 0; i < cs.length; i++) {
	 if(++map[cs[i]] == 1) count ++;
	 if(--map[ct[i]] == 0) count --;
	 }
	 return count == 0;
	 }

//	public boolean isAnagram(String s, String t)
//	{
//		char[] c1 = s.toCharArray();
//		char[] c2 = t.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		String c1s=new String(c1);
//		String c2s=new String(c2);
//		return c1s.equals(c2s);
//
//	}

}
