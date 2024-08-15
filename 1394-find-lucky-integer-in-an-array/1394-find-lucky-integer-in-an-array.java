class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
       for(Map.Entry<Integer,Integer> ent:hm.entrySet()){
           if(ent.getKey()==ent.getValue()){
              max=Math.max(max,ent.getValue());
           }
       }
        return max;
    }
}