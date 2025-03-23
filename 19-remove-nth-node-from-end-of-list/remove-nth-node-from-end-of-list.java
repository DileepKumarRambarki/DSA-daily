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
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int del=len-n;
        temp=head;
        for(int i=1;i<del;i++){
            temp=temp.next;
        }
        if(del>0){

        temp.next=temp.next.next;
        }
        else{
             head=head.next;
        }
        return head;
    }
}