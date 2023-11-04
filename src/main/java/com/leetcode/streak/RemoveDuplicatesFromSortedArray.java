package com.leetcode.streak;


/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Custom Judge:
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * <p>
 * int k = removeDuplicates(nums); // Calls your implementation
 * <p>
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3]
 * Output: 5, nums = [1,1,2,2,3,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 * <p>
 * Input: nums = [0,0,1,1,1,1,2,3,3]
 * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
 * Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 */
public class RemoveDuplicatesFromSortedArray {


    public static int counter = 0;
    public static int pointer = 0;

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        counter = 0;
        pointer = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
                counter++;
            } else {
                swap(nums, i);
                i = j;
            }
        }
        swap(nums, i);
        return pointer;
    }


    public static void swap(int[] nums, int i) {
        int max = counter >= 2 ? 2 : 1;
        while (pointer < (pointer + max)) {
            nums[pointer++] = nums[i];
            max--;
        }
        counter = 0;
    }

}
