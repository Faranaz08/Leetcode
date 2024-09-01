class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s==null && t==null){
            return false;
        }
       HashMap<Character,Integer> mp=new HashMap<>();
         for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
       for (char c : t.toCharArray()) {
            if (!mp.containsKey(c) || mp.get(c) == 0) {
                return false;  // If a character in t doesn't match, it's not an anagram
            }
            mp.put(c, mp.get(c) - 1);
        }
       return true;
    }
}