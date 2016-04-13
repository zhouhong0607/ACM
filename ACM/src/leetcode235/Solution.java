package leetcode235;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        return bothFind(root,p,q);
//    }
//    
//    public TreeNode bothFind(TreeNode node,TreeNode p,TreeNode q)
//    {
//       if(contains(node,p)&&contains(node,q))
//       {
//           if(contains(node.left,p)&&contains(node.left,q))
//           {
//               return bothFind(node.left,p,q);
//           }else if(contains(node.right,p)&&contains(node.right,q))
//           {
//                return bothFind(node.right,p,q);
//           }else
//           {
//               return node;
//           }
//       }
//       return null;
//    }
//    
//    public boolean contains(TreeNode root,TreeNode node)
//    {
//        if(root==null) return false;
//        if(root==node)
//        {
//           return true;
//        }
//         return contains(root.left,node)||contains(root.right,node);
//    }
//    
}