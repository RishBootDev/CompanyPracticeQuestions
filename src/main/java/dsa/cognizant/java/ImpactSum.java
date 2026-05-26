package dsa.cognizant.java;

import java.util.Arrays;

public class ImpactSum {

    public static int[] impactSum(int arr[]) {

        int pre[] = new int[arr.length];
        int suf[] = new int[arr.length];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             pre[i] = sum;
             sum += arr[i];
        }
        sum = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            suf[i] = sum;
            sum += arr[i];
        }

        int ans [] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = pre[i] + suf[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(impactSum(arr)));
    }
}
