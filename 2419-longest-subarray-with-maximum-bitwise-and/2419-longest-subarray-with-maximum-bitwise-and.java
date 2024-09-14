class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int n:nums){
             max=Math.max(max,n);
        }
        int count=0;
        int ans=1;
        for(int n:nums){
            if(n==max){
               count++; 
            }else{
                count=0;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}