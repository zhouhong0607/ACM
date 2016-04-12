package leetcode113;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution
{
	public List<List<Integer>> pathSum(TreeNode root, int sum)
	{
		List<List<Integer>> results = new ArrayList<>();
		Stack<Integer> path = new Stack<>();
		preTravel(root, sum, results, path,0);
		
		return results;
	}

	private void preTravel(TreeNode node, int sum, List<List<Integer>> results,Stack<Integer> path,int pathSum)
	{
		if(node==null)  return;
		
		path.push(node.val);
		pathSum+=node.val;
		if(node.left!=null)
		{
			preTravel(node.left, sum, results, path,pathSum);
			
		}
		if (node.right!=null)
		{
			preTravel(node.right, sum, results, path,pathSum);
			
		}
		
		if(node.left==null&&node.right==null)
		{
			if(pathSum==sum)
			{
				List<Integer> result=new ArrayList<>();
				for(Integer i:path)
				{
					result.add(i);
				}
				results.add(result);
			}
		}
		
		path.pop();
		pathSum-=node.val;
		
	}

	public static class TreeNode
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