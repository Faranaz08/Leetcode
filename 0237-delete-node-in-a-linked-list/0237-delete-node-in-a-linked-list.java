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
        node.val=Nextnode.val;
        node.next=Nextnode.next;
        Nextnode.next=null;
    }
}