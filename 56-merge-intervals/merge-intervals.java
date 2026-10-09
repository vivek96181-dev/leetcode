class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        List<int[]> l=new ArrayList<>();
        for(int[] i:intervals){
            l.add(i);
        }
        int i=0;
        while(i<l.size()-1){
            int[] f=l.get(i);
            int[] s=l.get(i+1);
            if(f[1]>=s[0]){
                l.set(i,new int[]{f[0],Math.max(f[1], s[1])});
                l.remove(i+1);
            }else{
                i++;
            } 

        }
        int[][] ans=new int[l.size()][2];
        for(int j=0;j<l.size();j++){
            ans[j]=l.get(j);
        }
        return ans;

    }
}