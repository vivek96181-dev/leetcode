class Solution {
    public int maxLength(int[] nums) {
        
        int n=nums.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            int p=nums[i];
            int lcm=nums[i];
            int gcd1=nums[i];
            for(int j=i+1;j<n;j++){
                int t=(lcm/gcd(lcm,nums[j]))*nums[j]*gcd(gcd1,nums[j]);
                lcm=(lcm/gcd(lcm,nums[j]))*nums[j];
                gcd1=gcd(gcd1,nums[j]);
                p*=nums[j];
                if(p==t){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}