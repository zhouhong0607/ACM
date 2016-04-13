package leetcode222;

import java.util.LinkedList;
import java.util.Queue;

import javax.rmi.CORBA.Util;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution
{
	public int countNodes(TreeNode root)
	{

		if (root == null)
		{
			return 0;
		}
		Queue<TreeNode> toVisit = new LinkedList<TreeNode>();
		toVisit.offer(root);
		int numNodes = 1;

		while (!toVisit.isEmpty())
		{
			TreeNode temp = toVisit.poll();

//			if (temp.val != -100)
//			{
//				temp.val = -100;
				if (temp.right != null)
				{
					toVisit.offer(temp.right);
					numNodes++;
				}
				if (temp.left != null)
				{
					toVisit.offer(temp.left);
					numNodes++;
				}
//			}

		}

		return numNodes;

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
	
	public static void main(String[] args)throws Exception
	{
		TreeNode node=new TreeNode(0);
		node.left=new TreeNode(0);
		node.right=new TreeNode(0);
		Solution solution=new Solution();
		solution.countNodes(node);
		
		int n=82;
		double log=  Math.log10(n)/Math.log10(3);
//		 System.out.print( Math.round(log));
//		 int turn=(int)log;
//		
//		 if(turn==log)
//			 System.out.print("True");
//		 else
//			 System.out.print("false");
		
	}

}