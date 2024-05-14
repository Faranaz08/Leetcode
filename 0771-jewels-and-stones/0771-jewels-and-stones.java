class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         HashMap<Character,Integer> mp=new HashMap<>();
         //a,1 A,1 A,2
        //frequency counting done
//          for(int i=0;i<stones.length();i++){//3
//              if(mp.containsKey(stones.charAt(i))){//A
//                  mp.put(stones.charAt(i),mp.get(stones.charAt(i))+1);//A,
//              }else{
//                  mp.put(stones.charAt(i),1);//a,1 A,1
//              }
//          }
        
//          int sum=0;
        
//          for(int i=0;i<jewels.length();i++){
//              if(mp.containsKey(jewels.charAt(i))){
//                  sum=sum+mp.get(jewels.charAt(i));
//              }
//          }
//          //character
//          return sum;
        
       //
        
        HashSet<Character> jewelSet=new HashSet<>();
        for(char j:jewels.toCharArray()){
            jewelSet.add(j);
        }int count=0;
        for(char s:stones.toCharArray()){
            if(jewelSet.contains(s)){
                count++;
            }
        }
       return count;

    }
}