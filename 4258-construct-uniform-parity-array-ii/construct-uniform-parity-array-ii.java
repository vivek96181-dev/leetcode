class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int mino=Integer.MAX_VALUE;
        int mine=Integer.MAX_VALUE;
        int o=0;
        int e=0;
        for(int i:nums1){
            if(i%2==0){
                e++;
                mine=Math.min(mine,i);
            }else{
                o++;
                mino=Math.min(mino,i);
            }
        }
        if(o>0 && e>0 && mino>mine) return false;
        return true;

    }
}