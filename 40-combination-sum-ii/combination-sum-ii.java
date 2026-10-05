class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates,target,0,new ArrayList<>(),0);
        return ans;
    }
    public void solve(int[] candidates,int target,int sum,List<Integer> l,int j){
        
        if(sum==target){
            List<Integer> l1=new ArrayList<>(l);
            
                ans.add(l1);
            
            return;
        }
        for(int i=j;i<candidates.length;i++){
            if (i > j && candidates[i] == candidates[i - 1]) continue;
            sum+=candidates[i];
            if(sum>target) break;
            l.add(candidates[i]);
            
            solve(candidates,target,sum,l,i+1);
            sum-=candidates[i];
            l.remove(l.size()-1);
            
        }
    }
}