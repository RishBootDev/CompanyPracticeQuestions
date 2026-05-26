package dsa.cognizant.java;

import java.util.HashSet;
import java.util.Set;

public class SubStringsCheck {

    public static int substringsCheck(String s, String t, int k) {

        Set<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {

            int temp = k;
            int idx = i;
            StringBuilder sb = new StringBuilder();
            while(temp --> 0) {
                sb.append(s.charAt(idx++));
            }
            set.add(sb.toString());
        }

        for (int i = 0; i <= t.length() - k; i++) {

            int temp = k;
            int idx = i;
            StringBuilder sb = new StringBuilder();
            while(temp --> 0) {
                sb.append(t.charAt(idx++));
            }
            if(set.contains(sb.toString())) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(substringsCheck("abcd", "abcd", 2));
    }
}
