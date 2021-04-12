package tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.right=new TreeNode(70);
        root.right.right.right=new TreeNode(80);

        levelOrderTraversal(root);
        System.out.println("\n");
        levelOrderTraversalByNewLine(root);

        System.out.println();
        maximumWidthOfTree(root);

    }
/*
* Maximum Width of Binary tree is the maximum number of nodes present in a level of the Tree.

 * */
    private static void maximumWidthOfTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int count=0,res=0;
        while (q.size()>1){
            TreeNode tmp = q.remove();
            if(tmp!=null)
                count++;
            if(tmp==null){
                res = Math.max(res,count);
                count=0;
                q.add(null);
                continue;
            }
            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
        }

        System.out.println(" width " + res);
    }

    private static void levelOrderTraversalByNewLine(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

//        Check condition q.size >1 as it is different from Level Order Traversal
        while (q.size()>1){
            TreeNode tmp=q.remove();
            if(tmp==null){
                System.out.println();
                q.add(null);
                continue;
            }

            System.out.print(" " + tmp.data);
            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
        }
    }

    private static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode tmp = q.remove();
            System.out.print(" "+ tmp.data);
            if(tmp.left!=null){
                q.add(tmp.left);
            }
            if(tmp.right!=null){
                q.add(tmp.right);
            }
        }
    }
}
