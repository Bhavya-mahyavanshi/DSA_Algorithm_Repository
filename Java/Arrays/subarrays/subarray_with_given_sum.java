package Java.Arrays.subarrays;


public class subarray_with_given_sum {
    public static int[] sliding_window(int[] arr, int target) {
        int curr_sum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            curr_sum += arr[right];

            while (curr_sum > target && left < right) {
                curr_sum -= arr[left];
                left++;
            }

            if (curr_sum == target)
                return new int[] { left + 1, right + 1 };
        }

        return new int[] {-1};
    }
}
