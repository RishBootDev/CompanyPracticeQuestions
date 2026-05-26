package dsa.cognizant.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueSetStrings {

    public static void uniqueString(String[] words) {

        Set<String> set = new HashSet<>();
        for(String str : words) {
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            set.add(new String(arr));
        }
        System.out.println(set);
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        String [] words = {"abcd", "dcba", "fhfjd"};
        uniqueString(words);
    }
}
