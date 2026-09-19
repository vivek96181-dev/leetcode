class Solution {
    public int countCommas(int n) {
        int l=0;
        int num=n;
        while(num>0){
            num/=10;
            l++;
        }
        if(l<=3) return 0;
        
        return n-999;


    }
}