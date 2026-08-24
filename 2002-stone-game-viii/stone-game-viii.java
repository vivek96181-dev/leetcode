class Solution {
    public int stoneGameVIII(int[] stones) {
        int n=stones.length;
        int a=0;
        int b=0;
        
        int[] prefix=new int[n];
        // int[] maxi=new int[n];
        // maxi[n-1]=stones[n-1];
        
        // for(int i=n-2;i>=0;i--){
        //     maxi[i]=Math.max(stones[i],maxi[i+1]);
            
        // }
        prefix[0]=stones[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+stones[i];
        }
        a=prefix[n-1];
        for(int i=n-2;i>=1;i--){
            b=prefix[i]-a;
            a=Math.max(a,b);
        }
        return a;

        // if(maxi[0]<=0) return prefix[n-1];
        // int j=0;
        // boolean is=true;
        // while(j<n-1){
        //     int k=Math.max(maxi[j],maxi[j+1]);
        //     if(k<=0) k=n;
        //     int in=j+k-1;
        //     int sum=0;
        //     if(in>n-1){
        //         sum=prefix[n-1];
        //     }else{
        //         sum=prefix[in];
        //     }
        //     if(is){
        //         a+=sum;
        //         is=false;
        //     }else{
        //         b+=sum;
        //         is=true;
        //     }
        //     j+=k-1;
        // }
        // return a-b;



    }
}