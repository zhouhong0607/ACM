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
		HashMap<Integer, Integer> map = new HashMap<>();
		int location = 0;
		for (int i = 0; i < strs.length; i++)
		{
			int hash = getHashCode(strs[i]);
			if (!map.containsKey(hash))
			{
				map.put(hash, location);
				result.add(new LinkedList<>());
				result.get(location).add(strs[i]);
				location++;
			} else
			{
				int index = 0;
				int size1=size(strs[i]);
				for (String s : result.get(map.get(hash)))
				{
					int size2=size(s);
					if(size1<size2)
						break;
					index++;
				}
				result.get(map.get(hash)).add(index, strs[i]);
			}
		}
		return result;

	}

	private int size(String s)
	{
		int size=0;
		char[] sc=s.toCharArray();
		for(int i=0;i<sc.length;i++)
			size=size*256+sc[i];
		return size;
	}
	
	// 计算 s 的 hashcode
	private int getHashCode(String s)
	{
		int hash = 0;
		char[] sc = s.toCharArray();
		Arrays.sort(sc);
		for (int i = 0; i < sc.length; i++)
			hash += hash*256+ sc[i];
		return hash;
	}
	
	public static void main(String[] args)throws Exception
	{
		String[] ss={"c","c"};
		Solution solution=new Solution();
		solution.groupAnagrams(ss);
	}
}
