class Solution {
    public boolean isBalanced(String num) {
        int sumeven = 0;
        int sumodd = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; 

            if (i % 2 == 0) {
                sumeven += digit;
            } else {
                sumodd += digit;
            }
        }

        return sumeven == sumodd; 
    }
}
