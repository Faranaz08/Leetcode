class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word:words){
            boolean cons=true;
            for(char c:word.toCharArray()){
               if(allowed.indexOf(c)<0){
                   cons=false;
               }
            }
            if(cons==true) count++;
        }
        return count;
    }
}