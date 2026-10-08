class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=""+nums[i];
        }
        Arrays.sort(arr, (a, b) -> (a + b).compareTo(b + a));
        String ans="";
        for(int i=n-1;i>=0;i--){
            ans+=arr[i];
        }
        if (arr[n-1].equals("0")) {
            return "0";
        }
        return ans;
    }
}