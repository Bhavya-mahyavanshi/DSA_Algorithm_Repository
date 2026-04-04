package Java.Arrays.basics;

public class sum_of_array {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}
