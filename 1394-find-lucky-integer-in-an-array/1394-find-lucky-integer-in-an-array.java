class Solution {
    public int findLucky(int[] nums) {
          HashMap<Integer,Integer> map=new HashMap<>();
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getKey()==e.getValue()){
                max=Math.max(max,e.getValue());
            }
        }
        return max;
    }
}


//2-2 key value
//3-1
//map.get(key)==map.get(value)