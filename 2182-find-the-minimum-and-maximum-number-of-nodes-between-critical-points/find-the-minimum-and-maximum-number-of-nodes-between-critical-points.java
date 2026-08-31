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
        ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        while(temp.next!=null){
            if(prev!=null && temp.next!=null &&
            ((temp.val>prev.val && temp.val>temp.next.val)||
            (temp.val<prev.val && temp.val<temp.next.val))){
                l.add(i);
            }
            i++;
            prev=temp;
            temp=temp.next;
        }
        if(l.size()<2) return new int[]{-1,-1};
        int max=l.get(l.size()-1)-l.get(0);
        int min=i;
        for(int j=1;j<l.size();j++){
            min=Math.min(min,l.get(j)-l.get(j-1));
        }
        return new int[]{min,max};


    }
}