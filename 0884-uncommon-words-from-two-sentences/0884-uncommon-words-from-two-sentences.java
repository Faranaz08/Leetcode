class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
          // Create a HashMap to store the word counts
        HashMap<String, Integer> map = new HashMap<>();
        
        // Combine both sentences and split them into words
        String[] words = (s1 + " " + s2).split(" ");
        
        // Count occurrences of each word
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        // Collect words that appear exactly once
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        // Return the result as an array
        return result.toArray(new String[0]);
    }
}