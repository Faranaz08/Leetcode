class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
        return ans;
         
    }
    
    
    int search(int[] nums,int target,boolean tf){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //nums[mid] 7 > target se bada end=mid-1
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){ //7<target se chota hy start=mid+1
                start=mid+1;
            }else{
                ans=mid; //else mid
            
            if(tf){ //if true
                end=mid-1; //
            }else{
                start=mid+1;
            }
            }
        }
        return ans;
        
        
        
    }
    
   
        
    
}