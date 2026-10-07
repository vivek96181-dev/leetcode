class Solution {
    public int trailingZeroes(int n) {
        long num=1;
        int c=0;
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            if(i%5==0){
                c++;
                c+=arr[i/5];
                arr[i]=arr[i/5]+1;
            } 
        }
        // long k1=num;
        

        // while(num>0){
        //     if(num%10==0){
        //         c++;

        //     }else break;
        //     num/=10;
        // }
        return c;
    }
    
}