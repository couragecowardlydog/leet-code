package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class $1431 {


    public List<Boolean> kidsWithCandies(int[] childrens, int extraCandies) {
        Boolean[] marked = new Boolean[childrens.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < childrens.length; i++) {
            max = Math.max(max, childrens[i]);
        }
        for (int i = 0; i < childrens.length; i++) {
            if (childrens[i] + extraCandies >= max)
                marked[i] = true;
            else
                marked[i] = false;
        }
        return Arrays.asList(marked);
    }


}
