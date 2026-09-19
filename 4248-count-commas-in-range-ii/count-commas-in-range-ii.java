class Solution {
    public long countCommas(long n) {
        long num=n;
        int l=0;
        while(num>0){
            num/=10;
            l++;
        }
        long ans=0;
        long q=1000;
        if(l<=3) return 0;
        if(l<=6){
            ans+=(n-q)+1;
        }else if(l<=9){
            ans+=999000;
            ans+=(n-(q*q)+1)*2;
        }else if(l<=12){
            ans+=999000;
            ans+=999000000*2;
            ans+=(n-(q*q*q)+1)*3;
        }else if(l<=15){
            ans+=999000;
            ans+=999000000*2;
            ans+=999000000000L*3;
            ans+=(n-(q*q*q*q)+1)*4;
        }else if(l<=16){
            ans+=999000;
            ans+=999000000*2;
            ans+=999000000000L*3;
            ans+=999000000000000L*4;
            ans+=(n-(q*q*q*q*q)+1)*5;
        }
        return ans;
    }
}