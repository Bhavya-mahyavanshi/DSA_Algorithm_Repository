package Java.Arrays.prefix_sum;

public class prefix_sum_basic {
    public static int[] prefix_sum(int[] arr) {
        if (arr.length == 0)
            return new int[0];

        int[] prefix_sum = new int[arr.length];
        prefix_sum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        return prefix_sum;
    }
}
