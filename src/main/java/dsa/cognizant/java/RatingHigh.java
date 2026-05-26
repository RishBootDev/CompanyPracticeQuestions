package dsa.cognizant.java;

public class RatingHigh {

    public static void ratingHigh(int arr[]) {

        for (int i = 1; i < arr.length - 1 ; i++) {
            int prev = arr[i - 1];
            int curr = arr[i];
            int next = arr[i + 1];

            if(prev < curr && curr > next) System.out.println(curr);
        }
    }
}
