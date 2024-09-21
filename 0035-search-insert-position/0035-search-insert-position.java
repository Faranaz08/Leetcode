class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;//may be ans answer or may not be
                high=mid-1;// look at the left
                
            }else{
                 low=mid+1;// look at the right
            }
        }
        return ans;
    }
}