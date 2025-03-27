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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp1=l1,temp2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        while(temp1!=null&&temp2!=null){
            int sum=temp1.val+temp2.val+carry;
            if(sum<=9){
                res.next=new ListNode(sum);
                carry=0;
            }
            else{
                res.next=new ListNode(sum-10);
                carry=1;
            }
            res=res.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            int sum=temp1.val+carry;
            if(sum<=9){
                res.next=new ListNode(sum);carry=0;
            }
            else{
                res.next=new ListNode(sum-10);
                carry=1;
            }
            res=res.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int sum=temp2.val+carry;
            if(sum<=9){
                res.next=new ListNode(sum);
                carry=0;
            }
            else{
                res.next=new ListNode(sum-10);
                carry=1;
            }
            res=res.next;
            temp2=temp2.next;
        }
        if(carry==1){
            res.next=new ListNode(1);
        }
        return dummy.next;
    }
}