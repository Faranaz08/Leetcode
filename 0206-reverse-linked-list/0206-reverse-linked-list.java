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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode front=head;
        ListNode prev= null;
        while(curr!=null){
            front=curr.next;//store the next node
            curr.next=prev;//reverse the link
            prev=curr;//move pre to current
            curr=front;// curr to next
        }
        return prev;
    }
}