class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=1;
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(c==0){
                ans=nums[i];
                
            }
            if(ans==nums[i]){
                c++;
            }else{
                c--;
            }
        }
        return ans;
    }
}