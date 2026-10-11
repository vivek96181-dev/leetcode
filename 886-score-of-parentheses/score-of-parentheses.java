class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
            }else{
                count--;
                ans+=pow(2,count);
                while(i<s.length() && s.charAt(i)!='('){
                    i++;
                    count--;
                }
                if(i<s.length()-1 && s.charAt(i)=='('){
                    i--;
                    count++;
                }
                
            }

        }
        return ans;
        
    }
    public int pow(int k,int j){
        if(j==0) return 1;
        for(int i=1;i<j;i++){
            k*=2;
        }
        return k;
    }
}