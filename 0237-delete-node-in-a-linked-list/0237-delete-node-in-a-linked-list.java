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
        ListNode NextNode=node.next;
        node.val=NextNode.val;
        node.next=NextNode.next;
        NextNode.next=null;
    }
}