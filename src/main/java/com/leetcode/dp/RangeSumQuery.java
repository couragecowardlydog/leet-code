package com.leetcode.dp;

/**
 * @author vivekanandan.sakthiv on Apr 2021
 * <p>
 * Given an integer array nums, find the sum of the elements between indices left and right inclusive, where (left <= right).
 * <p>
 * Implement the NumArray class:
 * <p>
 * NumArray(int[] nums) initializes the object with the integer array nums.
 * int sumRange(int left, int right) returns the sum of the elements of the nums array in the range [left, right] inclusive (i.e., sum(nums[left], nums[left + 1], ... , nums[right])).
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 * <p>
 * Explanation
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
 * numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
 * numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 * 0 <= left <= right < nums.length
 * At most 104 calls will be made to sumRange.
 * <p>
 * ["NumArray","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange","sumRange"]
 * [[[-8261,2300,-1429,6274,9650,-3267,1414,-8102,6251,-5979,-5291,-4616,-4703]],[0,8],[4,5],[9,11],[2,11],[0,12],[9,12],[2,5],[0,9],[5,9],[0,1],[12,12],[6,7],[5,8],[1,1],[6,7],[10,11],[11,12],[7,8],[4,11],[8,9],[4,11],[2,9],[2,6],[11,12],[5,8],[11,11],[1,9],[12,12],[10,10],[4,7],[12,12],[8,10],[7,9],[4,7],[0,7],[8,9],[10,12],[0,9],[10,12],[7,12],[9,9],[0,12],[1,3],[8,8],[7,10]]
 */


public class RangeSumQuery {

    public static void main(String[] args) {
        int[] input = new int[]{-8261, 2300, -1429, 6274, 9650, -3267, 1414, -8102, 6251, -5979, -5291, -4616, -4703};
//        input = new int[]{1, 4, -6};
        RangeSumQuery.NumArray numArray = new NumArray(input);
        System.out.println(numArray.sumRange(4, 5));
    }

    static class NumArray {

        int[] input;
        int[] sqrtDecompose;
        int sqrt;
        private final int[] sums;

        public NumArray(int[] input) {
            this.input = input;
            sqrt = (int) Math.ceil(Math.sqrt(this.input.length));
            sqrtDecompose = new int[sqrt];

            // Took 9ms
            for (int i = 0; i < input.length; i++) {
                sqrtDecompose[i / sqrt] += input[i];
            }

            // 6ms solution using DP
            sums = new int[input.length + 1];
            sums[0] = 0;
            for (int i = 1; i < sums.length; i++)
                sums[i] = sums[i - 1] + input[i - 1];
        }

        // 9ms
        public int sumRange(int left, int right) {
            int sum = 0;
            int start = left / sqrt;
            int end = right / sqrt;
            for (int i = start; i <= end; i++)
                sum += sqrtDecompose[i];
            for (int i = (start * sqrt); i < left; i++)
                sum -= input[i];
            for (int i = (right + 1); i < input.length && (i % sqrt != 0); i++)
                sum -= input[i];
            return sum;
        }

        // 6ms , found in leetcode
        public int dpsumRange(int left, int right) {
            return sums[right + 1] - sums[left];
        }
    }
}
