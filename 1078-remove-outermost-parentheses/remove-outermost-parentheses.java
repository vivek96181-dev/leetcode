class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(st.size()==1 && c==')'){
        //         st.pop();
        //     }
        //     else if(!st.isEmpty()){
        //         if(st.peek()=='(' && c==')'){
        //             String s1="";
        //             while(st.size()>1 && st.peek()=='('){
        //                 ans+='(';
        //                 s1+=')';
        //                 st.pop();
        //             }
        //             ans+=s1;
                    
        //         }else st.push(c);
        //     }else{
        //         st.push(c);
        //     }
        // }
        int co=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(co>0){
                if(co!=1 || c!=')'){
                    ans+=c;  
                }
                
            } 
            if(c=='(') co++;
            else co--;
        }
        return ans;
    }
}