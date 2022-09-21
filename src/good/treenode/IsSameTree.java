package good.treenode;

/**
 * @author wzk
 * @description
 * @Date 2022/9/15 10:50
 */
public class IsSameTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    /**
     * 输入：p = [1,2,3], q = [1,2,3]
     * 输出：true
     *
     * 输入：p = [1,2], q = [1,null,2]
     * 输出：false
     *
     * 输入：p = [1,2,1], q = [1,1,2]
     * 输出：false
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null&&q==null){
            return true;
        }else {
            if(p==null||q==null){
                return false;
            }else {
                if(p.val!=q.val){
                    return false;
                }else {
                    boolean sameTree = isSameTree(p.left, q.left);
                    boolean sameTree1 = isSameTree(p.right, q.right);
                    return sameTree && sameTree1;
                }
            }
        }
    }


    /**
     * 2.
     * 对称二叉树
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {

        if(root==null){
            return true;
        }
        return isSymmetric2(root.left,root.right);
    }

    private boolean isSymmetric2(TreeNode left, TreeNode right) {

        if(left==null && right==null) {
            return true;
        }
        if(left==null||right==null){

            return false;
        }
        if(left.val!= right.val){
            return false;
        }else {
            return isSymmetric2(left.left,right.right)&&isSymmetric2(left.right,right.left);
        }
    }


    /**
     * 3
     * 二叉树的最大深度
     *
     * 给定一个二叉树，找出其最大深度。
     *
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right)+1;
        }

    }







    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);

        p.left = new TreeNode(2);


        TreeNode q = new TreeNode(1);

        q.left = null;
        q.right = new TreeNode(2);

        IsSameTree isSameTree = new IsSameTree();
        boolean sameTree = isSameTree.isSameTree(p, q);

        System.out.println(sameTree);

    }






}
