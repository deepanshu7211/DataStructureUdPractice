package tree;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(40);
        root.right.right=new TreeNode(50);

        System.out.println(" In order traversal ");
        inOrderTraversal(root);
        System.out.println("\n Pre order traversal ");
        preOrderTraversal(root);

        System.out.println("\n Post order traversal ");
        postOrderTraversal(root);
    }

    private static void postOrderTraversal(TreeNode root) {
        if(root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(" " + root.data);
        }
    }

    private static void preOrderTraversal(TreeNode root) {
        if(root!=null){
            System.out.print(" "+ root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private static void inOrderTraversal(TreeNode root) {
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(" " + root.data);
            inOrderTraversal(root.right);
        }
    }
}
