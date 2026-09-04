class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        if(m==0 && n==0) return 0;
        if(m>n) return findMedianSortedArrays(nums2,nums1);
        int low=0;
        int high=m;
        int n1=(m+n+1)/2;
        int n2=m+n;
        while(low<=high){
            int mid1=(low+high)>>1;
            int mid2=n1-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if(mid1<m) r1=nums1[mid1];
            if(mid2<n) r2=nums2[mid2];
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n2%2==1) return Math.max(l1,l2);
                else return ((double)(Math.max(l1,l2)+Math.min(r1,r2)))/2.0;
            }else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
        // int[] arr=new int[m+n];
        // int j=0,k=0;
        // for(int i=0;i<m+n;i++){
        //     if(k<n && j<m && nums1[j]>nums2[k]){
        //         arr[i]=nums2[k++];
        //     }else if(j<m && k<n && nums1[j]<=nums2[k]){
        //         arr[i]=nums1[j++];
        //     }else if(k<n){
        //         arr[i]=nums2[k++];
        //     }else if(j<m){
        //         arr[i]=nums1[j++];
        //     }
            
        // }
        // int n1=m+n;
        // if((n1)%2!=0){
        //     return (double)arr[(n1-1)/2];
        // }
        // double num=arr[(n1-1)/2]+arr[(n1)/2];
        // return num/2;
        

    }
}