class Solution {
    public int[] runningSum(int[] nums) {
       int sum=0;
        int[] runningsum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            runningsum[i]=sum;
        }
        return runningsum;
    }
}