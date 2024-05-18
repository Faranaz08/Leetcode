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
        // givrn node not head
        ListNode Nextnode=node.next;//will store next node
        node.val=Nextnode.val;//pasting nextnode value into the node
        node.next=Nextnode.next;////changing address from node to next of nextnode
        Nextnode.next=null;
    }
}