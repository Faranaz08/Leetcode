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
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head==null || head.next==null){return head;}
        ListNode last=head;
        int c=1;
        while(last.next!=null){
            last=last.next;
            c++;
        }
        last.next=head;
        for(int i=0;i<c-(k%c);i++){
            last=last.next;
        }
        head=last.next;
        last.next=null;
        return head;
    }
}