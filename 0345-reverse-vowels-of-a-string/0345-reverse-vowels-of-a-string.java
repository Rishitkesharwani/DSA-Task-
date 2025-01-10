class Solution {
    public String reverseVowels(String s) {
        char[] w = s.toCharArray();
        int n = s.length();
        int f = 0;
        int e = n - 1;
        String vowels = "aeiouAEIOU";
        
        while (f < e) {
            while (f < e && vowels.indexOf(w[f]) == -1) {
                f++;
            }
            while (f < e && vowels.indexOf(w[e]) == -1) {
                e--;
            }
            char temp = w[f];
            w[f] = w[e];
            w[e] = temp;
            
            f++;
            e--;
        }
        return new String(w);
    }
}
