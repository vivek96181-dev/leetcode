class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] ans=new int[n];
        int i=0;
        
        for(int j=0;j<n;j++){
            char c=seq.charAt(j);
            if(c=='('){
                ans[j]=i%2;
                i++;
            }else if(c==')'){
                i--;
                ans[j]=i%2;
                
            }
        }
        return ans;
    }
}