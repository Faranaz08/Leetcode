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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pointers for traversing the list
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            // Move current to the last node of the current sequence of duplicates
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            // Check if prev's next is still current, if not we have duplicates to skip
            if (prev.next == current) {
                prev = prev.next; // No duplicates detected, move prev pointer
            } else {
                prev.next = current.next; // Skip all duplicates
            }
            current = current.next; // Move to the next node
        }
        return dummy.next; // Return the head of the modified list
    }
}