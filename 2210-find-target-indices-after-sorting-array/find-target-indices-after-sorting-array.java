class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int s=0;
        int e=n-1;
        List<Integer> l=new ArrayList<>();
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                l.add(mid);
                int m1=mid;
                while(--mid>=0 && nums[mid]==target){
                    l.add(0,mid);
                }
                while(++m1<n && nums[m1]==target){
                    l.add(m1);
                }
                break;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return l;
    }
}