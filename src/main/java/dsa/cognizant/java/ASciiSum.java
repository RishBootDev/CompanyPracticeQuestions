package dsa.cognizant.java;

public class ASciiSum {

    public static void AsciiSum(String [] words) {

        int max = Integer.MIN_VALUE;
        String temp = "";
        String bemp = "";
        int min = Integer.MAX_VALUE;
        for(String str : words) {
            int sum = calc(str);
            if(sum > max) {
                max = sum;
                temp = str;
            }
            if(sum < min) {
                min = sum;
                bemp = str;
            }
        }

        System.out.println(temp);
        System.out.println(bemp);
    }
    public static int calc(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        String words[] = {"abs", "zzzzz", "a", "slfjfhd"};
        AsciiSum(words);
    }
}
