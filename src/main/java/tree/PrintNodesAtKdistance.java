package tree;

public class PrintNodesAtKdistance {

    public static void main(String args[])
    {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.right=new TreeNode(70);
        root.right.right.right=new TreeNode(80);
        int k=2;

        printKDist(root,k);
    }

    public static void printKDist(TreeNode root,int k){
        if(root==null)return;

        if(k==0){System.out.print(root.data+" ");}
        else{
            printKDist(root.left,k-1);
            printKDist(root.right,k-1);
        }
    }
}
