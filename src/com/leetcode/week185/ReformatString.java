package com.leetcode.week185;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReformatString {

    public static String reformat(String s) {


        int i = 0;
        int j = 1;
        int charIndex = 0;
        int numIndex = 0;

        char[] alphaNum = s.toCharArray();

        while (i < alphaNum.length && j < alphaNum.length) {

            while (!isNum(alphaNum[numIndex])) {
                numIndex++;
                if (numIndex >= alphaNum.length)
                    return "";
            }

            while (isNum(alphaNum[charIndex])) {
                charIndex++;
                if (charIndex >= alphaNum.length)
                    return "";
            }

            if (isNum(alphaNum[i]))
                 swap(alphaNum, i, charIndex);

            if (!isNum(alphaNum[j]))
                swap(alphaNum, j, numIndex);

            i += 2;
            j += 2;
            charIndex++;
            numIndex++;
        }



        return String.valueOf(alphaNum);

    }

    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isNum(char x) {
        return (int) x <= 57;
    }




    public static void main(String[] args) {
        System.out.println(reformat("abc1234"));
    }
}
