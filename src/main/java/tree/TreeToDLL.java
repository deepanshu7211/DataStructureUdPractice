package tree;

public class TreeToDLL {

    private static TreeNode prev=null;

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(30);
        root.right.right=new TreeNode(35);

        TreeNode head=BTToDLL(root);
        printlist(head);
    }

    private static void printlist(TreeNode head) {
        TreeNode curr=head;
        while(curr!=null){
            System.out.print(" " + curr.data);
            curr=curr.right;
        }
    }


    //    Use In Order Traversal
    private static TreeNode BTToDLL(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode head = BTToDLL(root.left);
        if(prev==null){
            head=root;
        }
        else {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        BTToDLL(root.right);
        return head;
    }
}
