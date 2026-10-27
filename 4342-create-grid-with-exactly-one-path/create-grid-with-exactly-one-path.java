class Solution {
    public String[] createGrid(int m, int n) {
        String[] mat=new String[m];
        String s="";
        for(int i=0;i<n;i++){
            s+='.';

        }
        String s1="";
        for(int i=0;i<n-1;i++){
            s1+='#';
        }
        s1+='.';
        mat[0]=s;
        for(int i=1;i<m;i++){
            mat[i]=s1;
        }
        return mat;

    }
}