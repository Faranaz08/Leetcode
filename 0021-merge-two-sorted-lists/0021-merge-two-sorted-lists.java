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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
         //we have to creat new listnode because have to return mered listnode
        ListNode Dummyhead=new ListNode();
        ListNode temp=Dummyhead;// copying head
        while(list1!=null && list2!=null){
            if(list1.val > list2.val){//which is less that copy to temp head
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }else{
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
        }
        temp.next=(list1!=null)?list1:list2;// if any one is left out diffrent length of list the n add
        return Dummyhead.next;
    }
}