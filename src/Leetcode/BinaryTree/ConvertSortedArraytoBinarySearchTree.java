package Leetcode.BinaryTree;

import java.util.Arrays;

//108. https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        int length = nums.length;
        int mid = length/2;
        TreeNode ans = new TreeNode(nums[mid]);
        ans.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0,mid));
        ans.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, length));
        return ans;
    }
}
