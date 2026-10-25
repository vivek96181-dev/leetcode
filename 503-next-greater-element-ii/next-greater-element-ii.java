class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[2*n];
        for(int i=0;i<2*n;i++){
            res[i]=nums[i%n];
        }
        int[] res1=new int[2*n];
        Stack<Integer> st= new Stack<>();
        int i=2*n-1;
        while(i>=0){
            int id=i;
            while(!st.isEmpty() && res[st.peek()]<=res[id]){
                st.pop();
            }
            if(st.isEmpty()) {
                res1[id] = -1;
            }
            else {
                res1[id]=st.peek();
            }
            st.push(id);
            i--;
        }
        
        for(int j=0;j<n;j++){
            if(res1[j]!=-1){
                nums[j]=res[res1[j]];
            }else{
                nums[j]=-1;
            }
           
        }
        return nums;

    }
}