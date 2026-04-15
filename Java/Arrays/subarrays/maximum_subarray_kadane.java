package Java.Arrays.subarrays;

public class maximum_subarray_kadane {
    public static int sum(int[] arr) {
        if (arr.length == 0)
            return 0.;

        int max_so_far = arr[0];
        int curr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];

            if (curr_sum > max_so_far)
                max_so_far = curr_sum;

            if (curr_sum < 0)
                curr_sum = 0;

        }

        return max_so_far;
    }
}