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
    public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) {
            return true;
        }
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);
        ListNode firstHead=head,secndHead=newhead;
        while(secndHead != null){
            if(firstHead.val != secndHead.val){
                reverse(newhead);
                return false;
            }
            firstHead=firstHead.next;
            secndHead=secndHead.next;
        }
        reverse(newhead);
        return true;
    }
    private ListNode reverse(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode nextN=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextN;
        }
        return prev;
    }
}