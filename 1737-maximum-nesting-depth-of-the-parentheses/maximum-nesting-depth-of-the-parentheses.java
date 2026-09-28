class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int co=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                co++;
            }else if(c==')'){
                co--;
            }
            ans=Math.max(ans,co);
        }
        return ans;
    }
}