package leetcode3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution
{
	// public int lengthOfLongestSubstring(String s)
	// {
	// int n = s.length();
	// Set<Character> set = new HashSet<>();
	// int ans = 0, i = 0, j = 0;
	// while (i < n && j < n)
	// {
	// // try to extend the range [i, j]
	// if (!set.contains(s.charAt(j)))
	// {
	// set.add(s.charAt(j++));
	// ans = Math.max(ans, j - i);
	// } else
	// {
	// set.remove(s.charAt(i++));
	// }
	// }
	// return ans;
	// }

	// public int lengthOfLongestSubstring(String s)
	// {
	// int n = s.length(), ans = 0;
	// Map<Character, Integer> map = new HashMap<>(); // current index of
	// // character
	// // try to extend the range [i, j]
	// for (int j = 0, i = 0; j < n; j++)
	// {
	// if (map.containsKey(s.charAt(j)))
	// {
	// i = Math.max(map.get(s.charAt(j)), i);
	// }
	// ans = Math.max(ans, j - i + 1);
	// map.put(s.charAt(j), j + 1);
	// }
	// return ans;
	// }

	public int lengthOfLongestSubstring(String s)
	{
		int n = s.length(), ans = 0;
		int[] index = new int[128]; // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++)
		{
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}

	
	
	
	
	public static void main(String[] arg) throws Exception
	{
		String s = "abcabcbb";
		Solution solution = new Solution();
		System.out.println(solution.lengthOfLongestSubstring(s));

	}
}
