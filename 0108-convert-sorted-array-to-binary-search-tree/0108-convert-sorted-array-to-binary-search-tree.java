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
    public TreeNode sortedArrayToBST(int[] nums) {
        int left=0;
        int right=nums.length;
        TreeNode res= f(nums,0,right-1);
        return res;
    }
    public TreeNode f(int [] nums, int left, int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=f(nums,left,mid-1);
        root.right=f(nums,mid+1,right);
        return root;

    }
}