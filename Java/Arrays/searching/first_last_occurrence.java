package Java.Arrays.searching;


public class first_last_occurrence {
    public static int[] occurrence(int[] arr, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        return new int[] { first, last };
    }
}
