class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1,lmax=0,rmax=0,sum=0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]>=lmax){
                    lmax=arr[l];
                }else{
                    sum+=lmax-arr[l];
                }
                l++;
            }else{
                if(arr[r]>=rmax){
                    rmax=arr[r];
                }else{
                    sum+=rmax-arr[r];
                }
                r--;
            }
        }
        return sum;
    }
}