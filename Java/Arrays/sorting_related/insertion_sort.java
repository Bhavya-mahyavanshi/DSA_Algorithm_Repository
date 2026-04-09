package Java.Arrays.sorting_related;

public class insertion_sort {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return arr;
        
        int curr;
        for (int i = 0; i < arr.length; i++) {
            curr = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > curr) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = curr;
        }
        return arr;
    }
}
