class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brut force apporach
        int[] ind=new int[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    ind[0]=i;
                    ind[1]=j;
                }
            }
        }
        return ind;
    }
}