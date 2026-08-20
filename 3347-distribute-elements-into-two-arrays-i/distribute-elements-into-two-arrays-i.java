class Solution {
    public int[] resultArray(int[] nums) {
        int j=0;
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        l.add(nums[0]);
        l1.add(nums[1]);
        for(int i=2;i<n;i++){
            if(l.get(l.size()-1)>l1.get(l1.size()-1)) l.add(nums[i]);
            else l1.add(nums[i]);
        }
        while(j<l.size()){
            nums[j]=l.get(j);
            j++;
        }
        int k=0;
        while(k<l1.size()){
            nums[j]=l1.get(k);
            j++;
            k++;
        }
        return nums;
    }
}