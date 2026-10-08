class Solution {
    public long smallestNumber(long num) {
        String s=""+num;
        if(num<0)
            s=s.substring(1,s.length());
        else
            s=s.substring(0,s.length());    
        char[] arr=s.toCharArray();
        int n=arr.length;
        Arrays.sort(arr);
        if(num<0){
            String ans=new StringBuilder(new String(arr)).reverse().toString();
            ans='-'+ans;
            return Long.parseLong(ans);
        }
        int i=0;
        while(arr[i]=='0' && i<n-1){
            
            i++;
        }
        char c=arr[0];
        arr[0]=arr[i];
        arr[i]=c;
        return Long.parseLong(new String(arr));

    }
}