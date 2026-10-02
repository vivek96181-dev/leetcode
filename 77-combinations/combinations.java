class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        solve(1,n,k,new ArrayList<>());
        return l;
    }
    public void solve(int i,int n,int k,List<Integer> l1){
        if(l1.size()==k){
            l.add(new ArrayList<>(l1));
            return;
        }
       
        for(int j=i;j<=n;j++){
            l1.add(j);
            solve(j+1,n,k,l1);
            l1.remove(l1.size()-1);
        }
        
    }
}