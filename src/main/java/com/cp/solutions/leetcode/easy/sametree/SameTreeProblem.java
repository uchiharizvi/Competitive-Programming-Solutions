package Easy.SameTree;

import java.util.List;

/*Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
Example 1:
Input:     1         1
          / \       / \
         2   3     2   3
        [1,2,3],   [1,2,3]
Output: true
Example 2:
Input:     1         1
          /           \
         2             2
        [1,2],     [1,null,2]
Output: false
Example 3:
Input:     1         1
          / \       / \
         2   1     1   2
        [1,2,1],   [1,1,2]
Output: false

Hint: Preorder Traversal
*/
public class SameTreeProblem {
    public static void main(String[] args) {

        SameTreeProblem tree = new SameTreeProblem();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        //p.right = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(null);
        q.right = new TreeNode(2);

        System.out.println((tree.isSameTree(p, q)) ? "Both trees are same" : "Both trees are not same");
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
/*Preorder Traversal
* 1)Visit the root
2)Traverse the left subtree, call preorder(left)
3)Traverse the right subtree, call preorder(right)
*/
//Recursive Sol
        //Both Empty
        if (p == null && q == null) return true;
        //Both Non Empty
        if (p != null && q != null) {
            return (p.val == q.val
                    && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right));
        }
        //Either Empty
        return false;
    }

    private void traversePreOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        traversePreOrder(node.left, list);
        traversePreOrder(node.right, list);
    }
}
