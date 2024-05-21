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
      if(k<=0 || head==null || head.next==null){
          return head;
      }
        // find the length
        int c=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            c++;
        }
        //asign head
        last.next=head;
        // now traversse till l-k
        for(int i=0;i<c-(k%c);i++){
            last=last.next;
        }
        head=last.next;
        last.next=null;
        return head;
        
        
       
    }
}