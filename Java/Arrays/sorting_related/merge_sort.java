package Java.Arrays.sorting_related;


public class merge_sort {
    public static void _sort(int[] arr, int first, int last, int[] temp) {
        if (first < last) {
            int mid = first + last / 2;
            _sort(arr, first, mid, temp);
            _sort(arr, mid + 1, last, temp);
            merge(arr, first, mid, last, temp);
        }
    }

    public static void merge(int[] arr, int first, int mid, int last, int[] temp ){
        for (int i = first; i <= last; i++) {
            temp[i] = arr[i];
        }

        int i = first;
        int j = mid + 1;
        int k = first;

        
        while (i <= mid && j <= last) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        
        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        int[] temp = new int[arr.length];
        
        _sort(arr, 0, arr.length - 1, temp);
    }
}
