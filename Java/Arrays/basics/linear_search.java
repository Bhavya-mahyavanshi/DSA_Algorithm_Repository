package Java.Arrays.basics;

public class linear_search {
    public static int linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return num;
            }
        }

        return -1;
    }
}