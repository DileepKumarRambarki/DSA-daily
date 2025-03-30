/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node old=head;
        Node dummy=new Node(-1);
        Node copy=dummy;
        HashMap<Node,Node> hm=new HashMap<>();
        while(old!=null){
            Node a=new Node(old.val);
            copy.next=a;
            copy =a;
            hm.put(old,a);
            old=old.next;
        }
        old=head;
        copy=dummy.next;
        while(copy!=null){
            copy.random=hm.get(old.random);
            copy=copy.next;
            old=old.next;
        }
        return dummy.next;
    }
}