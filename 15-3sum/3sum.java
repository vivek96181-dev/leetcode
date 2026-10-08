class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> set=new ArrayList<>();
        Arrays.sort(nums);
        
        
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int s=i+1;
            int e=nums.length-1;
            while(s<e){
                int su=nums[s]+nums[i]+nums[e];
                
                if(su==0){
                    set.add(Arrays.asList(nums [s],nums[i],nums[e]));

                    while(s<e && nums[s]==nums[s+1]) s++;
                    while(s<e && nums[e]==nums[e-1]) e--;

                    s++;
                    e--;
                }
                else if(su<0){
                    s++;
                }else{
                    e--;
                }
            }
        }return set;
        
    }
}