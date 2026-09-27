class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        
        Stack<String> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=')') st.push(String.valueOf(c));
            else if(!st.isEmpty()){
                String s2="";
                while(!st.peek().equals("(")){
                    s2=st.pop()+s2;
                }
                st.pop();
                s2=new StringBuilder(s2).reverse().toString();
                st.push(s2);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}