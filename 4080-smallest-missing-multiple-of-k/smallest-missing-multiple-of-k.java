class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)) set.add(i);
        }
        int i=1;
        while(set.contains(i*k)){
            i++;
        }
        return i*k;
    }
}