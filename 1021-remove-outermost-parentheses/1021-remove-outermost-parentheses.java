class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()) {
                res+=s.charAt(i);
            }
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
            if(st.isEmpty()){
                res=res.substring(0,res.length()-1);
            }

        }
        return res;
        
    }
}