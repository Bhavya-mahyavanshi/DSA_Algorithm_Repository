package Java.Arrays.prefix_sum;

public class range_sum_query {
    private int[] prefix_sum;
    public static int[] prefix_sum(int[] arr) {
        if (arr.length == 0)
            return new int[0];

        prefix_sum = new int[arr.length];
        prefix_sum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        return prefix_sum;
    }

    public static prefix_sum_query(int L, int R){
        if(L == 0) return prefix_sum[R];

        return prefix_sum[R] - prefix_sum[L-1];
    }
}
