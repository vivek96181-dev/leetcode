class Solution {
    public double myPow(double x, int n) {
        long num=n;
        if(x==1) return x;
        
        if(n<0){
            num=(-num);
        }
        double ans=solve(x,num);
        
        if(n<0){
            ans=1/ans;
            return ans;
        }
        return ans;

    }
    public double solve(double x,long n){
        if(n<=0) return 1;
        double half = solve(x * x, n / 2);

        if (n % 2 == 0)
            return half;

        return x * half;
    }
}