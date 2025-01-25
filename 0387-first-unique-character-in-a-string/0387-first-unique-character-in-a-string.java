class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // Array to store character frequencies
        
        // First pass: Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Second pass: Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // Return -1 if no unique character exists
    }
}
