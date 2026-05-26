package dsa.cognizant.java;

public class SubArrayAlternateSize3 {

    public static int alternate(int arr[]) {

        int count = 0;
        for (int i = 1; i <= arr.length -1 ; i++) {

            int first = arr[i - 1];
            int second = arr[i];
            int third = arr[i + 1];

            if(first + third == second) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(alternate(arr));
    }
}
