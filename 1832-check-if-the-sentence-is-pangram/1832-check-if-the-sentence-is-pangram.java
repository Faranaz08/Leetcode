class Solution {
    public boolean checkIfPangram(String sen) {
        
        HashSet<Character> set = new HashSet<>();
        for (char s : sen.toCharArray()) {
            set.add(s);
        }
        return set.size() == 26;
    }
}