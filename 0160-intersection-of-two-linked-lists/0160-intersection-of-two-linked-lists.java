/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA= 0;
        int countB=0;
        ListNode curA=headA;
        ListNode curB =headB;
        if(headA ==null || headB == null)return null;
        while(curA!=null){
            curA=curA.next;
            countA++;
        }
        while(curB!=null){
            curB=curB.next;
            countB++;
        }
        int diff =countB -countA;
        if(diff>0){
            while(diff !=0){
                headB=headB.next;
                diff--;
            }
        }
        else{
            while( diff!=0){
                headA=headA.next;
                diff++;
            }
        }
        while(headA !=null && headB!=null){
            if(headA==headB)return headA;
            headA=headA.next;
            headB=headB.next;
          
        }
        
        return null;
    }
}