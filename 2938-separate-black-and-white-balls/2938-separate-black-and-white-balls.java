class Solution {
    public long minimumSteps(String s) {
       long black=0;
       long swap=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                black++;
            }else{
            swap+=black;

            }
        }
    return swap;

        
    }
}