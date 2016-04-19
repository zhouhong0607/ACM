package leetcode129;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution
{
	public int sumNumbers(TreeNode root)
	{

		return dfs(root, 0);
	}

	private int dfs(TreeNode node, int num)
	{
		if (node == null)
			return 0;
		num = num * 10 + node.val;

		if (node.left == null && node.right == null)
		{
			return num;
		}

		return dfs(node.left, num) + dfs(node.right, num);

	}

	public static void main(String[] args) throws Exception
	{
		Solution solution = new Solution();
		TreeNode root = new TreeNode(9);
		solution.sumNumbers(root);
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