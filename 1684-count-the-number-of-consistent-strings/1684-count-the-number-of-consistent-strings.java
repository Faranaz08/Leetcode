class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(char c:allowed.toCharArray()){
            set.add(c);
        }
        int count=0;
        for(String word:words){
            boolean cons=true;
            for(char c:word.toCharArray()){
                if(!set.contains(c)){
                    cons=false;
                    break;
                }
            }
            if(cons){
                count++;
            }
        }
        return count;
    }
}