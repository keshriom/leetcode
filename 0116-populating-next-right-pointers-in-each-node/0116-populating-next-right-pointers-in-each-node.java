/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node temp=root;
        while(temp!=null && temp.left!=null){
            Node n=temp;
            while(true){
                //for connection b/w 2 and 3 which is child of the same parent node
                n.left.next=n.right;
                if(n.next==null)break;
                //for connection b/w 5 and 6 which is child of the different parent node
                n.right.next=n.next.left;
                n=n.next;
            }
            //point the next node to the left means downward
            temp=temp.left;
        }
        return root;
    }
}