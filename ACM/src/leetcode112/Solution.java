package leetcode112;

public class   Solution
{
	public boolean hasPathSum(TreeNode root, int sum)
	{
		return dfs(root,0, sum);
	}

	private boolean dfs(TreeNode node,int num,int sum)
	{
		if(node==null) return false;
		num=num+node.val;
		if(node.left==null&&node.right==null)
			return num==sum;
		return dfs(node.left, num, sum)||dfs(node.right, num, sum);
		
	}
	
	public static void main(String[] args )throws Exception
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		Solution solution=new Solution();
		solution.hasPathSum(root, 3);
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
