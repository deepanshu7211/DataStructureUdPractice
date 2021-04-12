package tree;

import java.util.Stack;

public class SpiralTreeTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        spiralTreeTraversal(root);
    }

    private static void spiralTreeTraversal(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            while (!s1.isEmpty()) {

                TreeNode tmp = s1.peek();
                s1.pop();
                System.out.print(" " + tmp.data);

                if (tmp.right != null) {
                    s2.add(tmp.right);
                }
                if (tmp.left != null) {
                    s2.add(tmp.left);
                }
            }

            while (!s2.isEmpty()) {
                TreeNode tmp = s2.peek();
                s2.pop();

                System.out.print(" " + tmp.data);

                if (tmp.left != null)
                    s1.add(tmp.left);

                if (tmp.right != null)
                    s1.add(tmp.right);
            }
        }
    }
}
