package dsa.cognizant.java;

public class UniquePossiblePaths {

    public static int helper(int m, int n, int i, int j) {
        if(i == m - 1 && j == n - 1) return 1;

        if(i == m || j == n) return 0;

        // go right
        int count1 = helper(m, n, i + 1, j);
        // go down
        int count2 = helper(m, n, i, j + 1);

        return count1 + count2;
    }

    public static void main(String[] args) {
        System.out.println(helper(3,3, 0, 0));
    }
}
