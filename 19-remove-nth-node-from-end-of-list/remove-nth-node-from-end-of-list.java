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
        ListNode[] arr=new ListNode[30];
        int k=0;
        while(temp!=null){
            len++;
            arr[k++]=temp;
            temp=temp.next;
        }
        int del=len-n;
        if(del>0){
        temp=arr[del-1];
            temp.next=temp.next.next;
        }
        else{
            head=head.next;
        }
        return head;
    }
}