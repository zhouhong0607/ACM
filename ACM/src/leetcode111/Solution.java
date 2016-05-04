package leetcode111;

import java.util.LinkedList;
import java.util.Queue;

public class Solution
{
	public int minDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		return minDepth(root, 1);
	}

	private int minDepth(TreeNode node, int depth)
	{
		if (node.left == null && node.right == null)
		{
			return depth;
		} else if (node.left == null)
		{
			return minDepth(node.right, depth + 1);
		} else if (node.right == null)
		{
			return minDepth(node.left, depth + 1);
		} else
		{
			return Math.min(minDepth(node.left, depth+1), minDepth(node.right, depth+1));
		}

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
