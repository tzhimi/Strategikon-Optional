public class FindMaxValue {

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        int firstValue = array[0];
        for (int num : array) {
            if (num > firstValue) {
                firstValue = num;
            }
        }
        return firstValue;
    }

    public static void main(String[] args) {
        int[] array = {8, 16, 2, 3, 33, 60, 122, 90, 5};
        int max = findMax(array);
        System.out.println("Maximum value in the array: " + max);
    }
}
