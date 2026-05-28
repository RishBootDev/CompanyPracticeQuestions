package dsa.epam;

import java.util.Stack;

public class ScoreOfParanthesis {

    public int scoreOfParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') stack.push(ch);
            else if (ch == ')') {
               score += stack.size() - 1;
               stack.pop();
            }
        }
        return score;
    }
}
