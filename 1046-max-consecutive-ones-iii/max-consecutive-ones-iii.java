class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int ans=0;
        int n=nums.length;
        int j=0;
        int k1=k;
        for(int i=0;i<n;i++){
            

            if(nums[i]==1){
                c++;
            }else if(k>0){
                c++;
                k--;
            }else if(i!=j && k1!=0){
                c++;
                k--;
                while(j<i && k<0 && k<k1){
                    if(nums[j]==0) k++;
                    c--;
                    j++;
                }  
            }else{
                c=0;
            }
            



            ans=Math.max(ans,c);
        }
        return ans;
    }
}