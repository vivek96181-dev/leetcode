class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l=new ArrayList<>();
        
        
        for(int[] i:intervals){
            l.add(i);
        }
        l.add(newInterval);
        l.sort((a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        while(i<l.size()-1){
            int[] s=l.get(i);
            int[] e=l.get(i+1);
            if(s[1]>=e[0]){
                l.set(i,new int[]{s[0],Math.max(s[1],e[1])});
                l.remove(i+1);
            }else{
                i++;
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}