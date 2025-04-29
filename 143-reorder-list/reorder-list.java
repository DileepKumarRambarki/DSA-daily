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
    public void reorderList(ListNode head) {
        if(head.next==null) return ;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=slow.next;
        ListNode left=head;
        slow.next=null;
        right=reverse(right);
        ListNode temp=head;
        while(right!=null){
            ListNode temp1=temp.next;
            temp.next=right;
            right=right.next;
            temp=temp.next;
            temp.next=temp1;
            temp=temp.next;
        }
    }
    ListNode reverse(ListNode head){
        if(head==null) return head;
        ListNode curr=head,prev=null,after=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=after;
            if(curr!=null){

            after=curr.next;
            }
        }
        return prev;
    }
}