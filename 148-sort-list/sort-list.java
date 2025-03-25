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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        return mergesort(head);
    }
    ListNode mergesort(ListNode left){
        if(left==null||left.next==null){
            return left;
        }
            ListNode slow=left;
            ListNode fast=left;
            while(fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode mid=slow;
            ListNode temp=mid.next;
            mid.next=null;
            ListNode low=mergesort(left);
            ListNode high=mergesort(temp);
            return merge(low,high);

        

    }
    ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;

            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        
        return dummy.next;
    }
}