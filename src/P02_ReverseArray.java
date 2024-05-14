import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */


public class P02_ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};// Given array of integer values


        System.out.println("Original Array: " + Arrays.toString(array));// Printing original array


        reverseArray(array);// Reversing the array


        System.out.println("Reversed Array: " + Arrays.toString(array));  // Printing reversed array
    }


    public static void reverseArray(int[] arr) {  // Method to reverse the array
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }
}

