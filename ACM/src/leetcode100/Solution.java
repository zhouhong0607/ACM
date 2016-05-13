package leetcode100;

public class Solution
{
	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		if (p == null && q == null)
		{
			return true;
		} else if ((p == null && q != null) || (p != null && q == null))
		{
			return false;
		} else
		{

			return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

		}
	}

//	public boolean isSameTree(TreeNode p, TreeNode q)
//	{
//		return p == null && q == null ? true
//				: p == null || q == null || p.val != q.val ? false
//						: isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//	}

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
