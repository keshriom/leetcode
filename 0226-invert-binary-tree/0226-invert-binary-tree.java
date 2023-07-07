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
    public TreeNode invertTree(TreeNode root) {
        //base condition.........
        if(root ==null)return root;
        //Call the function recursively for the left subtree...
        invertTree(root.left);
        //Call the function recursively for the right subtree...
        invertTree(root.right);
        //swapping process..........
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        
        return root;
    }
}