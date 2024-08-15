class Solution {
    public int numJewelsInStones(String j, String s) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<j.length();i++){
            hs.add(j.charAt(i));
        }
        int c=0;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                c++;
            }
        }
        return c;
    }
}