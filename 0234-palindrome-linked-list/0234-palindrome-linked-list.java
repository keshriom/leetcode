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
    //-------to reverse a linked list------------
    public ListNode reverse(ListNode head){
        if(head==null ||head.next==null)return head;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode save =null;
            save=curr.next;
            curr.next=prev;
            prev=curr;
            curr=save;
        }
        return prev;
    } 
    // ---------to finding middle element of a linked list
    public ListNode midelement(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null )return true;
        ListNode mid =midelement(head);
        ListNode  last= reverse(mid);
        ListNode curr=head;
        while(last!=null){
            if(last.val!=curr.val){
                return false;
            }
            last=last.next;
            curr=curr.next;
        }
        return true;

    }
}