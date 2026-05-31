package dsa.epam;

public class HouseRobber5 {

    public long rob(int[] nums, int[] colors) {
       return helper(nums, 0, -1, colors);
    }
    public long helper(int [] arr, int i, int prev, int col[]) {
        if(i == arr.length) {
            return 0;
        }

        // take and not take pattern
        long take = 0;
        long not = 0;

        if(prev == -1) {
           take = arr[i] + helper(arr, i + 1, col[i], col);
           not = helper(arr, i + 1, prev, col);
        }
        else if(col[prev] != col[i]) {
            take = arr[i] + helper(arr, i + 1, col[i], col);
            not = helper(arr, i + 1, prev, col);
        }else if(prev == i - 1){
            if(col[prev] == col[i]) {
                not = helper(arr, i + 1, prev, col);
            }else {
                take = arr[i] + helper(arr, i + 1, col[i], col);
                not = helper(arr, i + 1, col[i], col);
            }
        }

        return Math.max(take, not);
    }
}

