class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                c=nums[i];
            }else{
               hs.add(nums[i]);  
            }
           
        }
        return c;
    }
}