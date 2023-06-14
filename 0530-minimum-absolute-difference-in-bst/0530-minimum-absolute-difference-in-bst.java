/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int min=Integer.MAX_VALUE;
    Integer prev=null;
    public int getMinimumDifference(TreeNode root) {
        //we will traverse inorder bcz it gives u in sequence order
        if(root==null)return min;
        //left node visiting
        getMinimumDifference(root.left);
        //node visiting 
        if(prev!=null){
            min=Math.min(min,root.val-prev);
        }
        prev=root.val;
        //right node visiting
        getMinimumDifference(root.right); 
        
        return min;
    }
}