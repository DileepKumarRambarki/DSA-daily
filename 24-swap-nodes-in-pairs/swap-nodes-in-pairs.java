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
    public ListNode swapPairs(ListNode head) {
        if(head==null|| head.next==null) return head;
        ListNode a=head;
        ListNode b=head.next;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        head=dummy;
        ListNode prev=dummy;
        while(b!=null){
            prev.next=b;
            a.next=b.next;
            b.next=a;
            prev=a;
            a=a.next;
            if(a!=null){
            b=a.next;
            }
            else{
                b=null;
            }
        }
        head=head.next;
        return head;
    }
}