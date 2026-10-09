class Solution {
    public int minInsertions(String s) {
        Stack<Character> st=new Stack<>();
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && c==')'){
                if((i<n-1 && s.charAt(i+1)!=')') || (i==n-1)){
                    ans++;  
                }else{
                    i++;
                }
                st.pop();
            }else if(st.isEmpty() && c==')'){
                ans++;
                if((i<n-1 && s.charAt(i+1)!=')') || (i==n-1)){
                    ans++;
                }else{
                    i++;
                }
            }else{
                st.push(c);
            }

        }
        return ans+st.size()*2;
    }
}