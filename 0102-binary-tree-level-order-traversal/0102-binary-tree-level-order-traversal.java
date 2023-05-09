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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //we use queue data structure to store the root elements and and a list of list to store answer 
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)return ans;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> sublist=new ArrayList<>();
            int q_size=q.size();
            for(int i=0;i<q_size;i++){
                //take the 1st element of the queue if it is not null
            if(q.peek().left!=null)
                q.offer(q.peek().left);
            if(q.peek().right!=null)
                q.offer(q.peek().right);
            sublist.add(q.poll().val);
        }
            ans.add(sublist);
        }
        return ans;
    }
}