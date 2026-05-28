package dsa.cognizant.java;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] arr, int k) {

        int left = 0;
        int sum = 0;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            if(i - left + 1 == k) {
                max = Math.max(max, (sum*1.0)/k);
                sum -= arr[left];
                left ++;
            }
        }
        return max;

    }
}
