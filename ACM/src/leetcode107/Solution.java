package leetcode107;

import java.util.ArrayList;
import java.util.List;

public class Solution
{

	public List<List<Integer>> levelOrderBottom(TreeNode root)
	{
		List<List<Integer>> results=new ArrayList<>(); 
		travel(root, 0, results);
		
		int n=results.size();
		for(int i=0;i<n/2;i++)
		{
			List<Integer> assi=new ArrayList<>();
			assi=results.get(i);
			results.set(i, results.get(n-i-1));
			results.set(n-i-1, assi);
			
		}
		return results;
		
	}

	private void travel(TreeNode node,int level,List<List<Integer>> results)
	{
		if(node==null) return;
		
		if(results.size()<level+1)
		{
			results.add(new ArrayList<>());
		}
		results.get(level).add(node.val);
		travel(node.left, level+1, results);
		travel(node.right, level+1, results);
		
		
	}
	
	
	
	
	
	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x)
		{
			val = x;
		}

	}
}
