package leetcode104;

public class Solution
{
	public int maxDepth(TreeNode root)
	{
		return maxDepth(root, 0);
	}

	private int maxDepth(TreeNode node,int depth)
	{
		if(node==null) return depth;
		
		return Math.max(maxDepth(node.left,depth+1), maxDepth(node.right, depth+1));
	}
	public  static class TreeNode
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
