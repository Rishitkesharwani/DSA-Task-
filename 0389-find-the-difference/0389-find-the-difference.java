class Solution {
    public char findTheDifference(String s, String t) {
        char ch = 0; // Initialize with 0 (neutral for XOR)
        for (char c : s.toCharArray()) {
            ch ^= c;
        }
        for (char c : t.toCharArray()) {
            ch ^= c;
        }
        return ch; // The result is the extra character
    }
}
