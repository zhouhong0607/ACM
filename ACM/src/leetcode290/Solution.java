package leetcode290;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
	// public boolean wordPattern(String pattern, String str)
	// {
	// Map<Character, Integer> c=new HashMap<>();
	// Map<String, Integer> s=new HashMap<>();
	// char[] cs=pattern.toCharArray();
	// String[] ss=str.split(" ");
	// if(cs.length!=ss.length) return false;
	// int index=0;
	// for(int i=0;i<cs.length;i++)
	// {
	// if(!c.containsKey(cs[i]))
	// c.put(cs[i], ++index);
	// }
	// index=0;
	// for(int j=0;j<ss.length;j++)
	// {
	// if(!s.containsKey(ss[j]))
	// s.put(ss[j],++index);
	// }
	// if(c.size()!=s.size()) return false;
	// for(int k=0;k<cs.length;k++)
	// if(c.get(cs[k])!=s.get(ss[k]))
	// return false;
	// return true;
	// }

	public boolean wordPattern(String pattern, String str)
	{
		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;
		Map index = new HashMap<>();
		for (Integer i = 0; i < words.length; ++i)
			if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
				return false;
		return true;
	}

	public static void main(String[] args) throws Exception
	{
		String s1 = "abba";
		String s2 = "dog cat cat dog";
		Solution solution = new Solution();
		System.out.println(solution.wordPattern(s1, s2));
	}
}
