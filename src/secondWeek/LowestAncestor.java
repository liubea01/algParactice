package secondWeek;

public class LowestAncestor {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 三种情况： p， q同时在左边， 3）p，q同时在右边 ，
        //4）p，q在不同子树
        //p, q其中一个是root 2）
        //O(n)
        if (root == null || p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
        // if(left == null) return right;
        // if(right == null) return left;
        // return root;
    }

}
