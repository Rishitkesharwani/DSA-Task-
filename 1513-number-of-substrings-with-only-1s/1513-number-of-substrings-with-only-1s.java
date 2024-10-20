class Solution {
        public int numSub(String s) {
               int count=0;
               int cons=0;
               int mod = 1_000_000_007; 
        for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i)=='1'){
                    cons++;
                    count=(count+cons)%mod;
                }
                else{
                    cons=0;
                }
            }
        return count;

        }
}