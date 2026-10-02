class Solution {
    List<String> ans=new ArrayList<>();
    char[][] arr={
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
        };
    public List<String> letterCombinations(String digits) {
        solve(digits,0,"");
        return ans;
    }
    public void solve(String s,int n,String s1){
        if(n==s.length()){
            ans.add(new String(s1));
            return;
        }
        char[] a=arr[s.charAt(n)-'0'-2];
        for(int i=0;i<a.length;i++){
            s1+=a[i];
            solve(s,n+1,s1);
            s1=s1.substring(0,s1.length()-1);
        }
        return;

    }
}