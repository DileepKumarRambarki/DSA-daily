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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode before=null;
        ListNode curr=head;
        ListNode after=curr.next;
        while(curr!=slow){
            curr.next=before;
            before=curr;
            curr=after;
            if(curr!=null){
                after=curr.next;
            }
        }
        head.next=curr;
        ListNode newhead=before;
        if(fast!=null){
            slow=slow.next;
        }
        while(newhead!=null&&slow!=null){
            if(newhead.val!=slow.val){
                return false;
            }
            newhead=newhead.next;
            slow=slow.next;
        }
        return true;
    }
}