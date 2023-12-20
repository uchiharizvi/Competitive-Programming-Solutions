package Easy.SymmetricTree;
/*Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3
*/

import programs.leetcode.easy.symmetrictree.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();
        TreeNode root = new TreeNode(1);
        //left child
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(null);
        root.left.right = new TreeNode(3);
        //right child
        root.right = new TreeNode(2);
        root.right.left =  new TreeNode(null);
        root.right.right = new TreeNode(3);
        System.out.println(symmetricTree.isSymmetric(root));

    }
    public boolean isSymmetric(TreeNode root) {

        if(root.left.val == root.right.val){
            if(root.left.left.val == root.right.right.val && root.left.right.val == root.right.left.val){
                return true;
            }
        }
        return false;
    }
}
