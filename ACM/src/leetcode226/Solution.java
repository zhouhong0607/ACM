package leetcode226;

public class Solution
{
//	public TreeNode invertTree(TreeNode root)
//	{
//		if(root==null) return null;
//		
//		TreeNode left=root.left;
//		TreeNode right=root.right;
//		TreeNode assi=left;
//		root.left=right;
//		root.right=assi;
//		invertTree(root.left);
//		invertTree(root.right);
//		return root;
//		
//	}

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);

        return root;
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
