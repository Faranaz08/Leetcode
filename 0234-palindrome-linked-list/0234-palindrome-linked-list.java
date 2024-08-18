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
        if(head==null || head.next==null){
            return true;
        }
        
        // finding middle of the linkledlist
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //reverse the second half 
        ListNode newHead=reverse(slow.next);
        
        //compare first and second half
        ListNode firstHead=head;
        ListNode secondHead=newHead;
        while(secondHead!=null){
            if(firstHead.val!=secondHead.val){
                reverse(newHead);
                return false;
            }
            firstHead=firstHead.next;
            secondHead=secondHead.next;
        }
        reverse(newHead);
        return true;
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode front=head;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}