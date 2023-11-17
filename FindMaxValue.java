package teme.java_course1_intro;

public class FindMaxValue {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int max = findMax(arr);
        System.out.println("Maximum value in the array: " + max);
    }
}
