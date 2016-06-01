package leetcode337;

import java.util.HashMap;
import java.util.Map;


 
public class Solution
{
	public int rob(TreeNode root)
	{
		Map<TreeNode, Integer> map=new HashMap<>();
		return collect(root,map);
	}

	private int collect(TreeNode node,Map<TreeNode, Integer> map)
	{
		if(node==null) return 0;
		if(map.containsKey(node))
			return map.get(node);
		
		int rob=0;
		if(node.left!=null)
		{
			rob+=collect(node.left.left,map)+collect(node.left.right,map);
		}
		if(node.right!=null)
		{
			rob+=collect(node.right.left,map)+collect(node.right.right,map);
		}
		
		rob= Math.max(collect(node.left,map)+collect(node.right,map), node.val+rob);
		map.put(node, rob);
		return rob;
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

}