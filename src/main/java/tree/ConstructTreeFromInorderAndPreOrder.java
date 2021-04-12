package tree;

public class ConstructTreeFromInorderAndPreOrder {
    public static void main(String[] args) {
        int in[]={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        int n= in.length;
        TreeNode root=cTree(in, pre, 0, n-1);
        inorder(root);
    }

    private static void inorder(TreeNode root) {
        if(root!=null){
            inorder(root.left);
            System.out.print(" " + root.data);
            inorder(root.right);
        }

    }

    static int pIndex=0; // this is for prearray
    private static TreeNode cTree(int[] in, int[] pre, int is, int ie) {
        if(is>ie)return null;
        TreeNode root=new TreeNode(pre[pIndex++]);

        int inIndex=is;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.data){
                inIndex=i;
                break;
            }
        }
        root.left=cTree(in, pre, is, inIndex-1);
        root.right=cTree(in, pre, inIndex+1, ie);
        return root;

    }
}
