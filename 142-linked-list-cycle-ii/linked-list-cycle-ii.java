/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        if(head==null) return null;
        HashMap<ListNode, Integer> hm=new HashMap<>();
        while(temp!=null){
            if(hm.containsKey(temp)){
                return temp;
            }
            else{
                hm.put(temp,0);
                temp=temp.next;
            }
        }
        return null;
    }
}