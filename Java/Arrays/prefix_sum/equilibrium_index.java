package Java.Arrays.prefix_sum;


public class equilibrium_index {
    public static int equilibrium(int[] arr) {
        int total_sum = 0;
        int left = 0;

        for (int num : arr) {
            total_sum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            int right = total_sum - left - arr[i];

            if (left == right)
                return i;

            left += arr[i];
        }

        return -1;
    }
}
