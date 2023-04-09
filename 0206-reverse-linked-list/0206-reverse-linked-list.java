/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next ==  null)return head;
        ListNode prev = null;
        ListNode curr= head;
        ListNode save=head;
        while(curr !=null  ){
            save=curr.next;
            curr.next= prev;
            prev= curr;
           if(save!=null) curr=save;
           else break;
        }
        return prev;
    }
}