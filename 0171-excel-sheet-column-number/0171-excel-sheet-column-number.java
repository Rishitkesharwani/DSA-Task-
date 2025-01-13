class Solution {
    public int titleToNumber(String columnTitle) {
        int total = 0;
        for (char c : columnTitle.toCharArray()) {
            int d = c - 'A' + 1;
            total = 26 * total + d;
        }
        return total;
    }
}
