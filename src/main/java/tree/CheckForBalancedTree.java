package tree;

public class CheckForBalancedTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(20);

        if(isBalanced(root)>0)
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");
    }

    /*
    * In a Balanced Binary Tree for every node,
    * the difference between heights of left subtree and right subtree should not be more than one.
    * */

    private static int isBalanced(TreeNode root) {
        if(root==null)
            return 0;
        int left = isBalanced(root.left);
        if(left==-1)
            return -1;
        int right = isBalanced(root.right);
         if(right==-1)
             return -1;

        if(Math.abs(left-right)>1) {
            return -1;
        }
        else {
            return Math.max(left, right) + 1;
        }
    }
}
