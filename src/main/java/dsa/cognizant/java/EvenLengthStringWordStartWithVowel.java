package dsa.cognizant.java;

public class EvenLengthStringWordStartWithVowel {

    public static String solve(String sen) {

        String words [] = sen.split(" ");
        int max = Integer.MIN_VALUE;
        String ans = "00";

        for(String word : words) {
            if(word.length() % 2 == 0) {
                if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u'){
                    if(word.length() > max) {
                        max = word.length();
                        ans = word;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("I am enjoying online education"));
    }
}
