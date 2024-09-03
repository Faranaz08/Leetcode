class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean[] boo=new boolean[26];
        for(char c:allowed.toCharArray()){
            boo[c-'a']=true;
        }
        
        for(int i=0;i<words.length;i++){
            boolean cons=true;
            for(char o:words[i].toCharArray()){
                
                if(!boo[o-'a']){
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