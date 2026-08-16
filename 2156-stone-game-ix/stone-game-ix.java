class Solution {
    public boolean stoneGameIX(int[] stones) {
        int n1=stones.length;
        int sum=0;
        boolean is=false;
        int[] count=new int[3];
        for(int i:stones){
            count[i%3]++;
        }
        if (count[0] % 2 == 0) {
            return count[1] >=1 && count[2] >=1;
        }

        return Math.abs(count[1]-count[2])>2;
    }
}