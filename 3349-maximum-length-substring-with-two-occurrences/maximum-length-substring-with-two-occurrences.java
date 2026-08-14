class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
       
        int ans=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.get(c)>2){
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;

            }
            ans=Math.max(ans,i-j+1);


        }
        
        
        return ans;
        
    }
}