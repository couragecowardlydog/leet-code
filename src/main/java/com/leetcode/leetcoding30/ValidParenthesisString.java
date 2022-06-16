package com.leetcode.leetcoding30;

import java.util.Stack;

public class ValidParenthesisString {

    public static boolean checkValidString(String s) {

        int leftToRight = 0;
        int rigthToLeft = 0;

        for (int i = 0; i < s.length(); i++) {
            leftToRight = s.charAt(i) == '(' ? ++leftToRight : --leftToRight;
            if (leftToRight < 0)
                return false;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            rigthToLeft = s.charAt(i) == ')' ? ++rigthToLeft : --rigthToLeft;
            if (rigthToLeft < 0)
                return false;
        }
        return leftToRight == rigthToLeft;
    }


   public static void main(String[] args) {
        System.out.println(checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
    }
}
