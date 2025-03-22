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
    public ListNode oddEvenList(ListNode head) {
        if(head==null|| head.next==null) return head;
        ListNode curr=head;
        ListNode after=head.next;
        ListNode even=after;
        ListNode odd=curr;
        while(curr!=null && after!=null){
            curr.next=after.next;
            curr=after;
            after=after.next;
        }
        odd=head;
        while(odd.next!=null){
            odd=odd.next;
        }
        odd.next=even;
        return head;
    }
}