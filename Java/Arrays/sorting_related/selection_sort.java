package Java.Arrays.sorting_related;

public class selection_sort {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return arr;
        for (int i = 1; i < arr.length - 1; i++) {
            int small_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small_idx])
                    small_idx = j;
            }
            if (small_idx != i) {
                int temp = arr[small_idx];
                arr[small_idx] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
