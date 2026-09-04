class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        if(n-1>=hour) return -1;
        int max=0;
        for(int i:dist){
            max=Math.max(max,i);
        }
        int ans=max*100;
        int high=max*100;
        int low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            double h=0;
            for(int i=0;i<n;i++){
                if(i==n-1){
                    h+=(double)dist[i]/mid;
                }else{
                    h+=Math.ceil((double)dist[i]/mid);
                }
            }
            if(h<=hour){
                
                ans=Math.min(ans,mid);
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }
}