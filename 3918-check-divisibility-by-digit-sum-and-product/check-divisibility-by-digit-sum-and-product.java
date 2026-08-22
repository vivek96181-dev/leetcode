class Solution {
    public boolean checkDivisibility(int n) {
        int i=n;
        int k=0;
        int p=1;
        while(i>0){
            int r=i%10;
            k+=r;
            p*=r;
            i/=10;
        }
        return n%(k+p)==0;
    }
}