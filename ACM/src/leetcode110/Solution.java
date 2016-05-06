package leetcode110;

public class Solution
{
	public boolean isBalanced(TreeNode root)
	{
		if(root==null) return true;
		
		int leftHeight=getHeight(root.left);
		int rightHeight=getHeight(root.right);
		
		if(Math.abs(leftHeight-rightHeight)>1)
		{
			return false;
		}else
		{
			return isBalanced(root.left)&&isBalanced(root.right);
		}
	}

	private int getHeight(TreeNode node)
	{
		if(node==null) return 0;
		return Math.max(getHeight(node.left), getHeight(node.right))+1;
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
