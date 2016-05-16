package leetcode49;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
	public List<List<String>> groupAnagrams(String[] strs)
	{
		List<List<String>> result = new LinkedList<>();
		HashMap<String, Integer> map = new HashMap<>();
		int location = 0;
		for (int i = 0; i < strs.length; i++)
		{
			String hash = getKey(strs[i]);
			if (!map.containsKey(hash))
			{
				map.put(hash, location);
				result.add(new LinkedList<>());
				result.get(location).add(strs[i]);
				location++;
			} else
			{
				int index = 0;
				
				for (String s : result.get(map.get(hash)))
				{
					
					if(less(strs[i], s))
						break;
					index++;
				}
				result.get(map.get(hash)).add(index, strs[i]);
			}
		}
		return result;

	}

	private boolean less(String s1,String s2)
	{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]<c2[i]) return true;
			if(c1[i]>c2[i]) return false;
		}
		return false;
	}
	// 计算 s 的 hashcode
	private String getKey(String s)
	{
		char[] sc = s.toCharArray();
		Arrays.sort(sc);
		return new String(sc);
	}
	public static void main(String[] args)throws Exception
	{
		String[] ss={"and","dan"};
		Solution solution=new Solution();
		solution.groupAnagrams(ss);
	}
}
