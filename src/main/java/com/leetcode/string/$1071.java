package com.leetcode.string;

public class $1071 {

    public String gcdOfStrings(String str1, String str2) {

        boolean flag = false;
        String res = "";
        for (int i = 0; i < str2.length(); i++) {
            String temp = str2.substring(0, i + 1);
            for (int j = 0; j < str1.length(); j = j + i + 1) {
                if ((j + i + 1) > str1.length()) {
                    flag = true;
                    break;
                }
                if (!str1.substring(j, j + i + 1).equals(temp)) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (!flag) {

                res = temp;
//                break;
                if(str2.length() > str1.length()){
                    break;
                }
            }
        }


        return res;

    }

    public static void main(String[] args) {
        System.out.println(new $1071().gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

}
