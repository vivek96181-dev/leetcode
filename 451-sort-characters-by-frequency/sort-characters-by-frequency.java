class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character>[] l=new ArrayList[n+1];
        for(char c:map.keySet()){
            int f=map.get(c);
            if(l[f]==null){
                l[f]=new ArrayList<>();
            }
            l[f].add(c);
        }
        String ans="";
        for(int i=n;i>0;i--){
            if(l[i]!=null){
                for(char c:l[i]){
                    ans+=add(c,i);
                }
            }
        }
        return ans;
    }
    public String add(char c,int n){
        String s="";
        for(int i=0;i<n;i++){
            s+=c;
        }
        return s;
    }
}