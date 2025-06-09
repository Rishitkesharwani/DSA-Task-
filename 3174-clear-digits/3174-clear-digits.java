class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(ch);
            }
        }

        String temp = "";
        while (!st.isEmpty()) {
            temp += st.pop();  
        }

        String rev = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            rev += temp.charAt(i);
        }

        return rev;
    }
}
