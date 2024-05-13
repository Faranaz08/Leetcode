class Solution {
    public int findPeakElement(int[] nums) {
   
        
        int start=0;
        int end=nums.length-1;
        while(start<end){ // 0<3 // 2<3
            int mid=start+(end-start)/2; // mid=1 //mid=2
            if(nums[mid]<nums[mid+1]){ //nums[1]=2<nums[1+1] nums[2]=3 // this becomes false
                start=mid+1; //sstart=2
            }else{
                end=mid;//not comes in first iteration // end=2
            }
        }
        return start;// return 2
    }
}