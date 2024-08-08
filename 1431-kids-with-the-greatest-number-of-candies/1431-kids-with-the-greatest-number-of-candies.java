class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int i =0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
     for(int i=0;i<candies.length;i++){
         int sum=0;
         
         sum=candies[i]+extraCandies;
         
         if(sum>=max){
             ans.add(true);
         }else{
             ans.add(false);
         }
     }
        return ans;
    }
}