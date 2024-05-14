class Solution {
    public int[] twoSum(int[] nums, int target) {
        //2 for loop approach 
       // for(int i=0;i<nums.length;i++){
       //     for(int j=0;j<nums.length;j++){
       //         if(nums[i]+nums[j]==target && i!=j){
       //             return new int[]{i,j};
       //         }
       //     }
       // }
       //  return new int[]{-1,-1};
        
        // HashMap 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int comp=target-nums[j];
            if(map.containsKey(comp) && j!=map.get(comp)){
                return new int[]{j,map.get(comp)};
            }
        }
        return new int[]{-1,-1};
    }
}