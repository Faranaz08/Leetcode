public class Solution {
    public int findKthNumber(int n, int k) {
        int current = 1;  // Start with the smallest number, which is 1
        k--;  // We already consider the first number

        while (k > 0) {
            long steps = countSteps(n, current, current + 1);
            if (steps <= k) {
                // If the number of steps is less than or equal to k, we skip this prefix
                current++;  // Move to the next prefix
                k -= steps;  // Reduce k by the number of steps we skipped
            } else {
                // Otherwise, we go deeper in this prefix
                current *= 10;  // Move to the next level in the trie
                k--;  // We've moved to the next number, so decrement k
            }
        }
        
        return current;
    }

    // Count the steps between prefix and prefix + 1 within the range of n
    private long countSteps(int n, long prefix, long nextPrefix) {
        long steps = 0;
        while (prefix <= n) {
            steps += Math.min(n + 1, nextPrefix) - prefix;
            prefix *= 10;
            nextPrefix *= 10;
        }
        return steps;
    }
}
