package com.leetcode.string;

/**
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {

    public String reverse(String str) {
        StringBuffer sbr = new StringBuffer(str);
        return sbr.reverse().toString();
    }

    public String addBinary(String a, String b) {
        a = reverse(a);
        b = reverse(b);
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int base = 2;
        int i = 0;
        while (i < a.length() && i < b.length()) {
            int sum = carry + Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i));
            carry = sum / base;
            result.append(sum % base);
            i++;
        }

        while (i < a.length()) {
            int sum = carry +  Character.getNumericValue(a.charAt(i));
            carry = sum / base;
            result.append(sum % base);
            i++;
        }

        while (i < b.length()) {
            int sum = carry +  Character.getNumericValue(b.charAt(i));
            carry = sum / base;
            result.append(sum % base);
            i++;
        }


        if (carry == 1)
            result.append(1);
        return result.reverse().toString();
    }
}
