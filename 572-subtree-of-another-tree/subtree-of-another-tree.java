/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // TreeNode r=is(root,subRoot.val);
        // return isTheir(r,subRoot);
        // Queue<TreeNode> q=new LinkedList<>();
        // q.add(root);
        // boolean is=false;
        // while(!q.isEmpty()){
        //     int n=q.size();
        //     for(int i=0;i<n;i++){
        //         TreeNode ne=q.poll();
        //         if(ne.val==subRoot.val){
        //             if(isTheir(ne,subRoot)) return true;
        //             is=isTheir(ne,subRoot);
        //         }
        //         if(ne.left!=null) q.add(ne.left);
        //         if(ne.right!=null) q.add(ne.right);

        //     }
        // }
        // return is;
        if(root==null) return false;
        if(subRoot==null) return false;
        if(isTheir(root,subRoot)) return true;
        return isSubtree(root.right,subRoot) || isSubtree(root.left,subRoot);
    }
    // public TreeNode is(TreeNode root,int value){
    //     if(root==null){
    //         return new TreeNode();
    //     }
    //     if(root.val==value) return root;
    //     is(root.right,value);
    //     is(root.left,value);
    //     return new TreeNode();
        
    // }
    public boolean isTheir(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        else if((root==null && subRoot!=null) || (root!=null && subRoot==null)) return false;
        if(root.val!=subRoot.val) return false;
        boolean l=isTheir(root.left,subRoot.left);
        boolean r=isTheir(root.right,subRoot.right);
        return l&&r;
    }
}