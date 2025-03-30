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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        ListNode temp=head;
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        k=k%len;
        if(k==0) return head;
        k=len-k;
        temp=head;

        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
        ListNode newhead=temp.next;
        temp.next=null;
        tail.next=head;
        return newhead;
    }
}