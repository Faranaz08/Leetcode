class Solution {
    public boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                  if(nums[i]==nums[j] && i!=j){
//                 return true;
//             }
//             }
           
//         }
//         return false;
        HashSet<Integer> hs=new HashSet<>();
        for(int i :nums){
            hs.add(i);
        }
        return hs.size()!=nums.length?true:false;
    }
}