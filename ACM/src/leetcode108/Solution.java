package leetcode108;

import leetcode111.Solution.TreeNode;

public class Solution
{
	 public TreeNode sortedArrayToBST(int[] nums)
		{
		   return addNode(nums,0,nums.length);
			
		}

		public TreeNode addNode(int[] nums,int low,int high)
		{
		    if(high<low) return null;
		    
		    int mid=(low+high)/2;
		    TreeNode root=new TreeNode(nums[mid]);
		    root.left=addNode(nums,low,mid-1);
		    root.right=addNode(nums,mid+1,high);
		    
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
	public static void main(String[] args)throws Exception
	{
		int[] nums={1,3};
		Solution solution=new Solution();
		solution.sortedArrayToBST(nums);
	}
}
