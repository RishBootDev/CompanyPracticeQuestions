package dsa.cognizant.java;

import java.util.HashMap;
import java.util.Map;

public class KeepSimilarOnes {

    public static int keepSimilarOnes(String s){

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(int c : map.values()) max = Math.max(c, max);

        return s.length() - max;
    }

    public static void main(String[] args) {
        System.out.println(keepSimilarOnes("iiiiaaabbb"));
    }
}
