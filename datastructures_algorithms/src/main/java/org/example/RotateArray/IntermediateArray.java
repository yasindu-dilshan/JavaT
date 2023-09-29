package org.example.RotateArray;

public class IntermediateArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(input, k);
        for(int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }

    // create a new array and then copy elements to the new array
    // change the original array by using System.arraycopy
    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }


        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}



