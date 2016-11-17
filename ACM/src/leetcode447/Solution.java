package leetcode447;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Solution
{
	public int numberOfBoomerangs(int[][] points)
	{
		int n = points.length;
		int count = 0;
		// 计算点之间的距离
		
		Map<Long, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++)
		{
			
			for (int j = 0; j < n; j++)
			{
				if (j == i)
					continue;
				
				long a=points[i][0] - points[j][0];
				long b=points[i][1] - points[j][1];
				long dis = a*a+b*b;
				
				map.put(dis, map.getOrDefault(dis, 0)+1);
				
			}
			// 统计这一行中重复出现2次以上 的元素 k，出现次数n， 计算排列A（2，n）

			for (int v : map.values())
			{
				
				count +=v*(v-1);
			}
			map.clear();
		}
		return count;
	}

	public static void main(String[] args) throws Exception
	{
		// ,{1,1}
		int[][] points =
		{
				{ 0, 0 },
				{ 1, 0 },
				{ 2, 0 } };
		Solution solution = new Solution();
		System.out.println(solution.numberOfBoomerangs(points));
	}
}
