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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr =head;
        ListNode temp =head;
        int count=0;
        if(head==null || head.next==null)return null;

        while(curr!= null){
            curr=curr.next;
                count++;
        }
        int pos=count-n;
        if(pos==0)return head.next;
        int k=0;
        while(k<pos-1){
            k++;
            temp=temp.next;
           
        }
        if(temp.next!=null)
    temp.next=temp.next.next;
        return head;
    }
}