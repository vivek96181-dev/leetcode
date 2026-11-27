class Solution {
    public boolean canAliceWin(int n) {
        int c=10;
        while(n>0){
            if(n<c){
                if(c%2==0) return false;
                else return true;
            }
            n-=c;
            c--;

        }
        return c%2!=0;

    }
}