class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int n=s.length();
        int a=0,b=0,c=0;
        int j=0;
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            if(c1=='a') a++;
            else if(c1=='b') b++;
            else c++;
            while(a!=0 && b!=0 && c!=0){
                ans+=n-i;
                if(s.charAt(j)=='a') a--;
                else if(s.charAt(j)=='b') b--;
                else c--;
                j++;
            }
        }
        return ans;
        
        
    }
}