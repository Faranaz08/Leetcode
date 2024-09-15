class Solution {
    public int findTheLongestSubstring(String s) {
           // Vowel to bit position mapping
        HashMap<Character, Integer> vowelMap = new HashMap<>();
        vowelMap.put('a', 0);
        vowelMap.put('e', 1);
        vowelMap.put('i', 2);
        vowelMap.put('o', 3);
        vowelMap.put('u', 4);

        // Bitmask variable, where each bit represents the parity of a vowel count
        int bitmask = 0;
        int maxLength = 0;

        // HashMap to store the first occurrence of each bitmask
        HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1); // To handle cases when the entire string up to index is valid

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Update bitmask for vowels
            if (vowelMap.containsKey(c)) {
                bitmask ^= (1 << vowelMap.get(c));
            }

            // If the bitmask was seen before, calculate the length of the substring
            if (seen.containsKey(bitmask)) {
                maxLength = Math.max(maxLength, i - seen.get(bitmask));
            } else {
                seen.put(bitmask, i);
            }
        }

        return maxLength;
    }
}