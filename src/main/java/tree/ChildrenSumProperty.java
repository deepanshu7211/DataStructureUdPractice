package tree;

public class ChildrenSumProperty {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(20);
        root.left=new TreeNode(8);
        root.right=new TreeNode(12);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(9);

        System.out.print(" isCsum  " + isCSum(root));
    }

    /*
    * Children Sum Property is a property in which the sum of values of the left child and right child
    *  should be equal to the value of their node if both children are present.
    * Else if only one child is present then the value of the child should be equal to its node value.
    * */
    private static boolean isCSum(TreeNode root) {
        //Base cases
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left!=null)
            sum+=root.left.data;
        if(root.right!=null)
            sum+=root.right.data;

        boolean rootFlag= sum==root.data?true:false;
        boolean left = isCSum(root.left);
        boolean right = isCSum(root.right);
        return rootFlag && left && right;
    }
}
