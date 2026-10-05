class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(k,n,0,1,new ArrayList<>());
        return ans;
    }
    public void solve(int k,int n,int sum,int i,List<Integer> l){
        if(l.size()==k && sum==n){
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int j=i;j<10;j++){
            if(sum>n || l.size()>k) break;
            l.add(j);
            solve(k,n,sum+j,j+1,l);
            l.remove(l.size()-1);
        }
    }
}