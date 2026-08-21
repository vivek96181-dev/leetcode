class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        int c=0;
        for(int i=1;i<101;i++){
            if(freq[i]!=0) c++;
        }
        return c;

        
        
    }
}