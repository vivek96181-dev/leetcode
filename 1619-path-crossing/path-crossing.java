class Solution {
    public boolean isPathCrossing(String path) {
        int n=path.length();
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        map.putIfAbsent(0,new ArrayList<>());
        map.get(0).add(0);
        int y=0;
        int x=0;
        for(char c:path.toCharArray()){
            if(c=='N'){
                y++;
            }
            else if(c=='E'){
                x++;
        
               
            }else if(c=='S'){
                y--;
              
            }
            else if(c=='W'){
                x--;
          
            } 
            if(map.containsKey(x) && map.get(x).contains(y)) return true;
            map.putIfAbsent(x,new ArrayList<>());
            map.get(x).add(y);
           
        }
        return false;
    }
}