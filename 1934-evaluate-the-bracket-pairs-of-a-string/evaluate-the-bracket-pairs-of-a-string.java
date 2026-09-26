class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> l:knowledge){
            map.put(l.get(0),l.get(1));
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='('){
                ans+=c;
            }else{
                String s1="";
                int j=i+1;
                while(s.charAt(j)!=')'){
                    s1+=s.charAt(j);
                    j++;
                }
                if(map.containsKey(s1)){
                    ans+=map.get(s1);
                }else{
                    ans+='?';
                }
                
                i=j;
            }
        }
        return ans;
    }
}