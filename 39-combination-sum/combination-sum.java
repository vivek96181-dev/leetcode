class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<List<Integer>> ans1=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates,target,0,new ArrayList<>());
        return ans;
    }
    public void solve(int[] candidates,int target,int sum,List<Integer> l){
        
        if(sum>target) return;
        if(sum==target){
            
            List<Integer> l1=new ArrayList<>(l);
            Collections.sort(l1);
            if(ans1.contains(l1)){
                return;
            }else ans1.add(l1);
            if(!ans.contains(new ArrayList<>(l))){
                ans.add(new ArrayList<>(l));
            }
            
            return;
        }
       
        for(int i=0;i<candidates.length;i++){
            sum+=candidates[i];
            l.add(candidates[i]);
            solve(candidates,target,sum,l);
            sum-=candidates[i];
            l.remove(l.size()-1);
            
            
        }
    }
}