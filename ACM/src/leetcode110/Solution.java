package leetcode110;

public class Solution
{
	public boolean isBalanced(TreeNode root)
	{
		if(root==null) return true;
		
		if(root.left!=null&&root.right!=null)
		{
			return isBalanced(root.left)||isBalanced(root.right);
		}else if (root.left==null&&root.right==null)
		{
			return true;
		}else if (root.left==null)
		{
			 if(root.right.left!=null||root.right.right!=null) return false;
		}else
		{
			if(root.left.left!=null||root.left.right!=null) return false;
		}
		return true;
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
