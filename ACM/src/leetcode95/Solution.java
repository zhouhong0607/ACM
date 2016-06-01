package leetcode95;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<TreeNode> generateTrees(int n)
	{
		List<TreeNode>[] result = new List[n + 1];
		result[0] = new ArrayList<TreeNode>();
		
		if(n==0) return result[0];
		
		result[0].add(null);

		for (int len = 1; len <= n; len++)
		{
			result[len] = new ArrayList<TreeNode>();
			for (int j = 0; j < len; j++)
			{
				for (TreeNode nodeL : result[j])
				{
					for (TreeNode nodeR : result[len - j - 1])
					{
						TreeNode node = new TreeNode(j + 1);
						node.left = nodeL;
						node.right = clone(nodeR, j + 1);
						result[len].add(node);
					}
				}
			}
		}
		return result[n];
	}

	private TreeNode clone(TreeNode n, int offset)
	{
		if (n == null)
			return null;
		TreeNode node = new TreeNode(n.val + offset);
		node.left = clone(n.left, offset);
		node.right = clone(n.right, offset);
		return node;
	}

	public class TreeNode
	{
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int x)
		{
			val = x;
		}
	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		solution.generateTrees(3);
	}

}
