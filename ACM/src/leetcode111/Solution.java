package leetcode111;

import java.util.LinkedList;
import java.util.Queue;

public class Solution
{
	public int minDepth(TreeNode root)
	{
		if(root==null) return 0;
		int minDeep=0;
		Queue<TreeNode> curLevel=new LinkedList<>();
		curLevel.offer(root);
		
		while(!curLevel.isEmpty())
		{
			Queue<TreeNode> nextLevel=new LinkedList<>();
			minDeep++;
			while(!curLevel.isEmpty())
			{
				TreeNode node=curLevel.poll();
				
				if(node.left==null&&node.right==null)
				{
				    return minDeep;
				}
				
				if(node.left!=null)
				{
					nextLevel.offer(node.left);
				}
				if(node.right!=null)
				{
					nextLevel.offer(node.right);
				}
			}
		
			curLevel=nextLevel;
			
		}
		
		
		
		
		return  minDeep;
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
