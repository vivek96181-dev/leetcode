class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int n=s.length();
        List<Integer> l=new ArrayList<>();
        int k=0;
        int max=0;
        int dis=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            

            if(map.get(c)>=i){
                max=Math.max(max,map.get(c));
                int pre=max;
                int j=i+1;
                while(j<n && j<max){
                    if(map.get(s.charAt(j))>max){
                        max=map.get(s.charAt(j));
                        break;
                    }
                    j++;
                }
                if(max==pre){
                    l.add(max-k+1);
                    k=max+1;
                    i=max;

                } 

            }
            
        }
        return l;
    }
}