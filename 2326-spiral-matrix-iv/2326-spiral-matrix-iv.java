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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
         ListNode temp=head;
        int[][] arr=new int[m][n];
        int rs=0,cs=0,re=m-1,ce=n-1;
        while(rs<=re && cs<=ce){
            for(int i=cs;i<=ce;i++){
                if(temp!=null){
                    arr[rs][i]=temp.val;
                    temp=temp.next;
                }else{
                    arr[rs][i]=-1;
                }
            }
            rs++;
            for(int i=rs;i<=re;i++){
                if(temp!=null){
                    arr[i][ce]=temp.val;
                    temp=temp.next;
                }else{
                    arr[i][ce]=-1;
                }
            }
            ce--;
            if(rs<=re){
              for(int i=ce;i>=cs;i--){
                if(temp!=null){
                    arr[re][i]=temp.val;
                    temp=temp.next;
                }else{
                    arr[re][i]=-1;
                }
            } 
            re--; 
            }
            if(cs<=ce){
              for(int i=re;i>=rs;i--){
                if(temp!=null){
                    arr[i][cs]=temp.val;
                    temp=temp.next;
                }else{
                    arr[i][cs]=-1;
                }
            } 
            cs++; 
            }
        }
        return arr;
    }
}