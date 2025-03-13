/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        if(head==null) return null;
        if(head.next==null) return null;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast) return null;
        ListNode pos=head;
        while(pos!=slow){
            pos=pos.next;
            slow=slow.next;
        }
        if(pos==slow) return pos;
        return null;
    }
}