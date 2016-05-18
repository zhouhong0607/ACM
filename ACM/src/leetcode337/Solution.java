package leetcode337;

public class Solution
{
	public int rob(TreeNode root)
	{
		int money1=0;
		int money2=0;
		collect(root, money1, money2, true);
	}

	private void collect(TreeNode node,int money1,int money2,boolean flag)
	{
		if(node==null) return;
		if(flag)
		{
			money1+=node.val;
		}else
		{
			money2+=node.val;
		}
		collect(node.left, money1, money2, !flag);
		collect(node.right, money1, money2,!flag);
		
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