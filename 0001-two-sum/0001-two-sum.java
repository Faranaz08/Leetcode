class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using hashmap
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int comp=target-nums[j];
            if(mp.containsKey(comp) && j!=mp.get(comp)){
                return new int[] {j,mp.get(comp)};
            }
        }
    return new int[] {-1,-1};
        //using 2 for loops 
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if((nums[i]+nums[j])==target && i!=j){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {-1,-1};


        //
    }
}