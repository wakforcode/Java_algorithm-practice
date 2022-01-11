package treenode;

/**
 * @author wzk
 * @ClassName treenode.TreeNode.java
 * @Description 树
 * <p>
 * DLR--前序遍历（根在前，从左往右，一棵树的根永远在左子树前面，左子树又永远在右子树前面 ）
 * <p>
 * LDR--中序遍历（根在中，从左往右，一棵树的左子树永远在根前面，根永远在右子树前面）
 * <p>
 * LRD--后序遍历（根在后，从左往右，一棵树的左子树永远在右子树前面，右子树永远在根前面）
 * @createTime 2021年12月23日 16:21:00
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }


    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
     * <p>
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * Input:
     * preorder = [3,9,20,15,7],前序遍历
     * inorder = [9,3,15,20,7] 中序遍历
     * Output: [3,9,20,null,null,15,7]
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        } else {
            int left = preorder[0 + 1];
            int right = preorder[0 + 2];
            int root = preorder[0];
            TreeNode treeNode = new TreeNode(root);
            treeNode.left = new TreeNode(left);
            treeNode.right = new TreeNode(right);

            for (int i = 0;i<=inorder.length-1;i++){

                if(inorder[i]==left){

                }

            }




        }


        return null;
    }

}
