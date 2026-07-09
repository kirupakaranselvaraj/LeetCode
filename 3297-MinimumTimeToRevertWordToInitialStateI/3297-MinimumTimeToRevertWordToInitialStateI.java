// Last updated: 09/07/2026, 09:10:27
class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        
        for (int i = k; i < n; i += k) {
            // Check if prefix (0..n-i) matches suffix (i..n)
            if (word.substring(0, n - i).equals(word.substring(i))) {
                return i / k;
            }
        }
        
        // If no earlier reset, it always resets after n/k operations
        return (n + k - 1) / k;  // ceil(n/k)
    }
}
