package dsa.cognizant.java;

public class PyramidSum {

    public static int pyramidSum(int n) {

        int total = 0;
        for (int i = 1; i <= n; i++) {
            int sum = i*(i+1) - 1;
            total += sum;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(pyramidSum(3));
    }
}
