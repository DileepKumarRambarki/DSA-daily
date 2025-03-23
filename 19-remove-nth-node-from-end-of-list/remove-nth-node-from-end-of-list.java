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
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        ListNode fast=temp;
        ListNode slow=head;
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}