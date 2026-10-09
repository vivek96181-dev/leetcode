class Solution {
    public int minInsertions(String s) {
        int st=0;
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(st>0 && c==')'){
                if((i<n-1 && s.charAt(i+1)!=')') || (i==n-1)){
                    ans++;  
                }else{
                    i++;
                }
                st--;
            }else if(st==0 && c==')'){
                ans++;
                if((i<n-1 && s.charAt(i+1)!=')') || (i==n-1)){
                    ans++;
                }else{
                    i++;
                }
            }else{
                st++;
            }

        }
        return ans+st*2;
    }
}