package com.cp.solutions.leetcode.medium;

/*Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

1)The left subtree of a node contains only nodes with keys less than the node's key.
2)The right subtree of a node contains only nodes with keys greater than the node's key.
3)Both the left and right subtrees must also be binary search trees.*/
public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        ValidateBinarySearchTree tree = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        //root.left.left = new TreeNode(2);
        System.out.println(tree.isValidBST(root));
    }

    public boolean isValidBST(TreeNode root) {
        //if tree is empty
        if (root == null) return false;
        //if root has children(both present)
        if (root.left != null && root.right != null) {
            return isValidBST(root.left) && isValidBST(root.right);
        }
        //General Condition
        return false;
    }
}
