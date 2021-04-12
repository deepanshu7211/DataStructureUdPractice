package tree;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(40);
        root.right.right=new TreeNode(60);
        root.right.left.left=new TreeNode(50);
        root.right.right.right=new TreeNode(70);
        System.out.println("Height: "+height(root));
        System.out.println("Diameter: "+res);
    }
    static int res=0;
    private static int height(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh =height(root.left);
        int rh =height(root.right);
        res=Math.max(res,1+lh+rh);
        return Math.max(lh,rh)+1;
    }
}
