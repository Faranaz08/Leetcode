class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1,leftmax=0,rightmax=0,sum=0;
        while(l<r){
           if(arr[l]>leftmax){
               leftmax=Math.max(leftmax,arr[l]);
           }
            if(arr[r]>rightmax){
               rightmax=Math.max(rightmax,arr[r]);
           }
            if(leftmax<rightmax){
                sum+=leftmax-arr[l];
                l++;
            }else{
                 sum+=rightmax-arr[r];
                r--;
            }
            
        }
        return sum;
    }
}