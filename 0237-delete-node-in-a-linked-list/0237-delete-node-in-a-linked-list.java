/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode Nextnode=node.next;
        node.val=node.next.val;
        node.next=Nextnode.next;
        Nextnode.next=null;
        
        
        
        
        
        
        
        
        // // givrn node not head
        // ListNode Nextnode=node.next;//will store next node
        // node.val=Nextnode.val;//pasting nextnode value into the node
        // node.next=Nextnode.next;////changing address from node to next of nextnode
        // Nextnode.next=null;
    }
}