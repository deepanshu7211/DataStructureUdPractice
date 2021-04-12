package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeOperations {

    private static int maxLevel=0;

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.right=new TreeNode(70);
        root.right.right.right=new TreeNode(80);

        int height =height(root);
        System.out.println("height of tree " + height);

        int treeSize = getTreeSize(root);
        System.out.println(" size of tree " + treeSize);

        getMaximum(root);

        System.out.println(" Print the left most element ");
        printLeftView(root,1);


    }

//    Here we are using the pre order code . And just adding the Level to print only Left Most element
    private static void printLeftView(TreeNode root, int level) {
        if(root==null){
            return;
        }
        if(level > maxLevel){
            System.out.print(" " + root.data);
            maxLevel=level;
        }
        printLeftView(root.left,level+1);
        printLeftView(root.right,level+1);
    }

    private static void getMaximum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max=root.data;
        while (!q.isEmpty()){
            TreeNode tmp = q.remove();
            if(max < tmp.data){
                max=tmp.data;
            }
            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
        }
        System.out.println(" max " + max);
    }

    private static int getTreeSize(TreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            int left=getTreeSize(root.left);
            int right = getTreeSize(root.right);
            return left+right+1;
        }
    }

    private static int height(TreeNode root) {
        if(root==null){
            return 0;
        }
        else {
            int left= height(root.left);
            int right= height(root.right);
            return Math.max(left,right)+1;
        }
    }
}
