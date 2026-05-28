package dsa.epam;

public class HouseRobber3 {


    // this is the correct approach to solve this question
    // now furthur optimizing it lead to a dp solution
    public int rob(TreeNode root) {
        if(root == null) return 0;

        // take
        int first = root.left == null? 0 : rob(root.left.left);
        int second = root.left == null ? 0: rob(root.left.right);
        int third = root.right == null ? 0: rob(root.right.left);
        int fourth = root.right == null ? 0: rob(root.right.right);


        int take = root.val+first + second + third + fourth;

        // not take
        int not = rob(root.left) + rob(root.right);

        return Math.max(take, not);
    }

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
