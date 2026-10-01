class Solution {
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String> l=new ArrayList<>();
        char[][] l1=new char[n][n];
        if(n==1){
            l.add("Q");
            ans.add(l);
            return ans;

        }
        String s="";
        for(int i=0;i<n;i++){
            s+='.';
            Arrays.fill(l1[i],'.');
        }
        for(int i=0;i<n;i++){
            l.add(s);
        }
        // if(solve(l1,0)){
        //     for (char[] row : l1) {
        //         l.add(new String(row));
        //     }
        //     ans.add(l);
        // }
        solve(l,0,ans);
        return ans;
    }
    public static void solve(List<String> l,int n,List<List<String>> ans){
        if(n==l.size()){
            ans.add(new ArrayList<>(l));
            return;
        }
        char[] arr=l.get(n).toCharArray();
        for(int i=0;i<l.size();i++){
            if(safe(l,n,i)){
                arr[i]='Q';
                l.set(n,new String(arr));
                solve(l,n+1,ans);
                arr[i]='.';
                l.set(n,new String(arr));
            }
        }
        return;
        
    }
    public static boolean safe(List<String> l,int row,int col){
        for(int i=row;i>=0;i--){
            if(l.get(i).charAt(col)=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(l.get(i).charAt(j)=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j<l.size();i--,j++){
            if(l.get(i).charAt(j)=='Q') return false;
        }
        return true;
    }
}