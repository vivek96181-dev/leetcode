class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int[] map=new int[n];
        int d=0;
        int j=0;
        int ans=0;

        for(int i=0;i<n;i++){
            
            if(map[fruits[i]]==0){
                d++;
            }
            map[fruits[i]]++;
            if(d>2){
                while(d>2){
                    map[fruits[j]]--;
                    if (map[fruits[j]] == 0) {
                        d--;
                    }
                    j++;
                }
            }
            ans=Math.max(ans,i-j+1);

        }
        return ans;
    }
}