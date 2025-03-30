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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=head;
        ListNode dummy=new ListNode(-1);
        ListNode newhead=dummy;
        while(temp!=null){
            ListNode left=temp;
            for(int i=0;i<k-1;i++){
                if(temp==null) break;
                temp=temp.next;
            }
            if(temp==null){
                newhead.next=left;
                break;
            } 
            ListNode right=temp;
            temp=temp.next;
            reverse(left,right);
            newhead.next=right;
            newhead=left;

        }
        return dummy.next;
    }
    void reverse(ListNode left,ListNode right){
        ListNode prev=null;
        ListNode curr=left;
        ListNode next=curr.next;
        while(prev!=right){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=curr.next;
            }
        }

    }
}