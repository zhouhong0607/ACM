package leetcode120;

import java.util.ArrayList;
import java.util.List;

public class Solution
{

	public int minimumTotal(List<List<Integer>> triangle)
	{
		for (int i = triangle.size() - 2; i >= 0; i--)
			for (int j = 0; j <= i; j++)
				triangle.get(i).set(j,triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
		return triangle.get(0).get(0);
	}

	// public int minimumTotal(List<List<Integer>> triangle)
	// {
	// List<List<Integer>> minSum=new ArrayList<>();
	// minSum.add(new ArrayList<>());
	//
	// minSum.get(0).add(triangle.get(0).get(0));
	//
	// for(int i=1;i<triangle.size();i++)
	// {
	// List<Integer> sumLine=new ArrayList<>();
	// int firstValue=minSum.get(i-1).get(0)+triangle.get(i).get(0);
	// sumLine.add(firstValue);
	//
	// for(int j=1;j<triangle.get(i).size()-1;j++)
	// {
	// int minValue=triangle.get(i).get(j)+Math.min(minSum.get(i-1).get(j),
	// minSum.get(i-1).get(j-1));
	//
	// sumLine.add(minValue) ;
	// }
	// int lastValue=minSum.get(i-1).get(i-1)+triangle.get(i).get(i);
	//
	// sumLine.add(lastValue);
	// minSum.add(sumLine);
	// }
	// int minPath=Integer.MAX_VALUE;
	// for(Integer v:minSum.get(minSum.size()-1))
	// minPath=Math.min(minPath, v);
	// return minPath;
	// }

	public static void main(String[] args) throws Exception
	{
		List<List<Integer>> trianle = new ArrayList<>();
		List<Integer> line1 = new ArrayList<>();
		List<Integer> line2 = new ArrayList<>();
		List<Integer> line3 = new ArrayList<>();
		line1.add(-1);
		trianle.add(line1);

		line2.add(2);
		line2.add(3);
		trianle.add(line2);

		line3.add(1);
		line3.add(-1);
		line3.add(-3);
		trianle.add(line3);

		Solution solution = new Solution();

		System.out.println(solution.minimumTotal(trianle));
	}
}
