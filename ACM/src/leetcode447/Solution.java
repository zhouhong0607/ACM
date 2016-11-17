package leetcode447;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Solution
{
	public int numberOfBoomerangs(int[][] points)
	{
		int n=points.length;
		long[][] distances=new long[n][n];//存放不同点之间的距离
		int count=0;
		//计算点之间的距离
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				distances[i][j]=(long)Math.pow(points[i][0]-points[j][0], 2)+(long)Math.pow(points[i][1]-points[j][1],2);
				distances[j][i]=distances[i][j];
			}
			//统计这一行中重复出现2次以上 的元素 k，出现次数n， 计算排列A（2，n）
			Map<Long, Integer> map=new HashMap<>();
			for(int k=0;k<n;k++)
			{
				if(!map.containsKey(distances[i][k]))
				{
					map.put(distances[i][k], 1);
				}else
				{
					map.put(distances[i][k], map.get(distances[i][k])+1);
				}
			}
			for(long key:map.keySet())
			{
				if(map.get(key)>1)
				{
					count+=pailie(2,map.get(key));
				}
			}
		}
		return count;
	}
	
	public int pailie(int m,int n)
	{
		return n*(n-1);
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
		//,{1,1}
		int[][] points={{0,0},{1,0},{2,0}};
		Solution solution=new Solution();
	System.out.println(solution.numberOfBoomerangs(points));	
		
		
	}
}
