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
    public boolean isPalindrome(ListNode head) {//1221 first mid then reverse then check 
        if(head==null && head.next==null){
            return true;
        
        }
        ListNode slow=head,fast=head;// mid
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);
        
        //check valus
        ListNode firsthead=head,sechead=newhead;
        while(sechead!=null){
            if(firsthead.val!=sechead.val){
                reverse(newhead);
                return false;
            }
            sechead=sechead.next;
            firsthead=firsthead.next;
        }
        reverse(newhead);
        return true;
    }
    public ListNode reverse(ListNode head){//FCP
        ListNode front=head,curr=head,prev=null;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}