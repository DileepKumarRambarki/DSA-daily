/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int a=0,b=0;
        while(temp1!=null){
            a++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            b++;
            temp2=temp2.next;
        }
        ListNode max=null;
        ListNode min=null;
        if(a>b){
            max=headA;
            min=headB;
        }
        else{
            max=headB;
            min=headA;
        }
        for(int i=0;i<Math.abs(a-b);i++){
            max=max.next;
        }
        while(max!=min){
            max=max.next;
            min=min.next;
        }
        return max;
    }
}