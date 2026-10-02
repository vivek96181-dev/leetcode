class Solution {
    List<String> l=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        solve(n,0,"",0);
        return l;

    }
    public void solve(int n,int o,String s,int c){
        if(o==n && c==n){
            l.add(s);
            return;
        }
        if(o<n){
            solve(n,o+1,s+'(',c);
        }
        if(c<o){
            solve(n,o,s+')',c+1);
        }
    }
    
}