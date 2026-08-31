/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp=head,prev=null;
       
        int i=0;
        int p=-1;
        int min=-1;
        int max=-1;
        int in=-1;
        boolean is=true;
        while(temp.next!=null){
            if(prev!=null && temp.next!=null &&
            ((temp.val>prev.val && temp.val>temp.next.val)||
            (temp.val<prev.val && temp.val<temp.next.val))){
                
                if(min==-1 && p!=-1){
                    min=i-p;
                }
                if(p!=-1){
                    min=Math.min(min,i-p);
                } 
                p=i;
                if(is && in==-1){
                    
                    in=i;
                    is=false;
                }
                else if(!is) max=Math.max(max,i-in);
            }
            i++;
            prev=temp;
            temp=temp.next;
        }
        
        
        
        
        return new int[]{min,max};


    }
}