package Java.Arrays.sorting_related;

public class bubble_sort {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return arr;
        
        for (int i = 0; i < arr.length; i++) {
            Boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return arr;
    }
}
