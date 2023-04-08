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
    //to sort the tree use inorder traversal because it gives u the value in ascending order
    //store the inorder value in an array 
    //for kth samllest then a[k-1] gives the answer
    //for kth largest then a[n-k] gives the answer
    //the TC: O(n) and SC: O(n)
    //---------Now optimized solution-------
    //make a function 
    int ans=0;
    int count=1;
    public void func(TreeNode root,int k){
        if(root == null) return;
        func(root.left,k);//calling left
        //calling the value 
        if(k==count){
            ans=root.val;
            count++;
            return;
        }
        else count++;
        func(root.right,k);//calling right
    }
    public int kthSmallest(TreeNode root, int k) {
        func(root,k);
        return ans;
    }
}
//for kth largest element in optimized way is ------
//take reverse inorder traversal (Right Root Left)