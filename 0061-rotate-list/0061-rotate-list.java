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
        //
        if(k<=0 || head==null || head.next==null){
            return head;
        }
        //length
        ListNode last=head;
        int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        //assign head
        last.next=head;
        
        //now traverse till l-k
        for(int i=0;i<length-(k%length);i++){
            last=last.next;
        }
        
        head=last.next;
        //breaking circular link
        last.next=null;
        return head;
        
    }
}