class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        int c=0;
        for(int i:nums){
            if(i==0) c++;
            xor^=i;
        }
        if(xor!=0) return n;
        else if(xor==0 && c==n) return 0;
        return n-1;

    }
}